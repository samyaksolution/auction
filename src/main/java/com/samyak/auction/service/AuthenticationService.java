package com.samyak.auction.service;

import com.samyak.auction.config.JwtService;
import com.samyak.auction.model.api.request.auth.AuthenticationRequest;
import com.samyak.auction.controller.AuthenticationResponse;
import com.samyak.auction.model.api.request.auth.RegisterRequest;
import com.samyak.auction.domain.*;
import com.samyak.auction.exceptions.UserAlreadyExistsException;
import com.samyak.auction.model.api.request.address.AddressRequest;
import com.samyak.auction.model.api.request.user.AdditionalInfoRequest;
import com.samyak.auction.model.api.request.user.UserRequest;
import com.samyak.auction.repository.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository repository;
    private final AddressRepository addressRepository;
    private final UserRoleAssignRepository userRoleAssignRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final TokenRepository tokenRepository;
    private final AuthenticationManager authenticationManager;

    private User savedUser;
    private Address savedAddress;

    public AuthenticationResponse register(@NotNull RegisterRequest request){
        UserRequest userRequest = request.getUser();
        AdditionalInfoRequest additionalInfoRequest = request.getAdditionalInfo();
        var user  = User.builder()
                .firstName(userRequest.getFirstname())
                .lastname(userRequest.getLastname())
                .midName(userRequest.getMidname())
                .email(userRequest.getEmail())
                .username(userRequest.getUsername())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .phone(userRequest.getPhoneNumber())
                .faxNo(userRequest.getFaxNo())
                .companyName(userRequest.getCompanyName())
                .active(userRequest.getStatus())
                .referance(additionalInfoRequest.getReferenceName())
                .userId( UUID.randomUUID())
                .remark(additionalInfoRequest.getRemark())
                .createBy("System")
                .updated(new Timestamp(new Date().getTime()))
                .created(new Timestamp(new Date().getTime()))
                .build();
        Optional<User> dbUser = repository.findByEmail(user.getEmail());
        if(dbUser.isPresent()){
            throw new UserAlreadyExistsException("User with username " + user.getUsername() + " already exists");
        }

        Address address = saveAddress(request, user);
        performSaving(user, address);
        UserRoleAssign userRoleAssign = createUserRoleAssign(this.savedUser, userRequest, this.savedAddress);


        Map<String, Object> extraClaims = new HashMap<>();
        extraClaims.put("firstname",userRequest.getFirstname());
        extraClaims.put("email",userRequest.getEmail());
      //  extraClaims.put("role",Role.USER.name());  TODO : should the token contain role too?
        var jwtToken = jwtService.generateToken(extraClaims, user);
        saveUserToken(this.savedUser, jwtToken);

        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Transactional
    private void performSaving(User user, Address address) {

        try {
            this.savedUser = repository.save(user);
            this.savedAddress= addressRepository.save(address);

        }catch (Exception ex){
            throw new RuntimeException("Something went wrong" + ex.getMessage());
        }
    }

    private UserRoleAssign createUserRoleAssign(User user, UserRequest request, Address address) {
        String roleName = request.getRole();
        Optional<Role> role = roleRepository.findByName(request.getRole());
        if(!role.isPresent()){
            throw new IllegalArgumentException(String.format("roleName %s not present", roleName));
        }
        UserRoleAssign userRoleAssign = UserRoleAssign.builder()
                .roleAssignId(UUID.randomUUID())
                .userId(user.getUserId())
                .roleId(role.get().getRoleId())
                .active(true)
                .createBy("System")
                .created(new Timestamp(new Date().getTime()))
                .build();

        userRoleAssignRepository.save(userRoleAssign);
        return userRoleAssign;
    }

    private Address saveAddress(RegisterRequest request, User user) {
        AddressRequest addressRequest = request.getAddress();
        long currentTimestampMillis = System.currentTimeMillis();
        var ad = Address.builder()
                .city(addressRequest.getCity())
                .contry(addressRequest.getCountry())
                .houseNo(addressRequest.getHouseNo())
                .created(new Timestamp(currentTimestampMillis))
                .userId(user.getUserId())
                .zipcode(addressRequest.getZipcode())
                .addressId(UUID.randomUUID())
                .state(addressRequest.getState())
                .type(addressRequest.getType())
                .createBy("System")
                .updateBy("System")
                .active(true)
                .updated(new Timestamp(currentTimestampMillis))

                .build();

       return ad;
    }

    private void saveUserToken(User user, String jwtToken) {
        var token = Token.builder()
                .user(user)
                .token(jwtToken)
                .tokenType(TokenType.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepository.save(token);
    }

    public AuthenticationResponse authenticate(@NotNull AuthenticationRequest request){
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        if(!authenticate.isAuthenticated()){
            throw new BadCredentialsException("Bad credentials");
        }

        var user = repository.findByUsername(request.getUsername()).orElseThrow(() -> new NoSuchElementException("User not found for username: " + request.getUsername()));

        var jwtToken = jwtService.generateToken(user);
        saveUserToken(user, jwtToken);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
