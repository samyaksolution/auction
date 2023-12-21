package com.samyak.auction.service;

import com.samyak.auction.controller.AuthenticationResponse;
import com.samyak.auction.domain.User;
import com.samyak.auction.dto.AuthenticationRequest;
import com.samyak.auction.dto.UserInfo;
import com.samyak.auction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleAssignService userRoleAssignService;
    @Autowired
    private UserTokenService userTokenService;

    public AuthenticationResponse register(UserInfo userRequest) {

        User user = userService.save(userRequest);
        addressService.save(userRequest.getAddressInfo(), user);
        userRoleAssignService.save(user.getUserId(), userRequest.getRole());
        AuthenticationResponse response = new AuthenticationResponse("User created successfully");
        return response;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        if (!authenticate.isAuthenticated()) {
            throw new BadCredentialsException("Bad credentials");
        }

        var user = repository.findByUsername(request.getUsername()).orElseThrow(() -> new NoSuchElementException("User not found for username: " + request.getUsername()));

        var jwtToken = jwtService.generateToken(user);
        AuthenticationResponse response = new AuthenticationResponse(jwtToken);
        userTokenService.saveKeyValue(user.getUsername(), jwtToken);
        return response;

    }
}
