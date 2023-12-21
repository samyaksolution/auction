package com.samyak.auction.service;

import com.samyak.auction.domain.Address;
import com.samyak.auction.domain.Role;
import com.samyak.auction.domain.User;
import com.samyak.auction.domain.UserRoleAssign;
import com.samyak.auction.dto.AddressInfo;
import com.samyak.auction.dto.UserInfo;
import com.samyak.auction.exceptions.UserAlreadyExistsException;
import com.samyak.auction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class UserService implements IUser {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserRoleAssignService userRoleAssignService;
    @Autowired
    private RoleService roleService;

    public List<UserInfo> findAllUsers() {

        List<User> allUsers = userRepository.findAll();
        List<UserInfo> userInfos = new ArrayList<>();
        for (User user : allUsers) {

            Optional<UserRoleAssign> userRoleAssign = userRoleAssignService.getRoleByUserId(user.getUserId());
            Optional<Role> roleByRoleId = Optional.empty();
            if (userRoleAssign.isPresent()) {
                roleByRoleId = roleService.findRoleByRoleId(userRoleAssign.get().getRoleId());

            }
            UserInfo userInfo = new UserInfo();
            userInfo.setFirstname(user.getFirstName());
            userInfo.setMidname(user.getMidName());
            userInfo.setLastname(user.getLastname());
            userInfo.setEmail(user.getEmail());
            userInfo.setRole(roleByRoleId.map(Role::getName).orElse(null));
            userInfo.setFaxNo(user.getFaxNo());
            userInfo.setRemark(user.getRemark());
            userInfo.setUsername(user.getUsername());
            userInfo.setPhoneNumber(user.getPhone());
            userInfo.setStatus(user.getActive());
            userInfo.setReferenceName(user.getReferance());
            userInfo.setCompanyName(user.getCompanyName());


            Optional<Address> addressOptional = addressService.getAddressByUserId(user.getUserId());
            if (addressOptional.isPresent()) {
                Address address = addressOptional.get();
                AddressInfo addressInfo = new AddressInfo();
                addressInfo.setState(address.getState());
                addressInfo.setType(address.getType());
                addressInfo.setZipcode(address.getZipcode());
                addressInfo.setHouseNo(address.getHouseNo());
                addressInfo.setCity(address.getCity());
                addressInfo.setCountry(address.getContry());
                userInfo.setAddressInfo(addressInfo);
            }
            userInfos.add(userInfo);
        }
        return userInfos;
    }

    public User save(UserInfo userRequest) {

        var user = new User();
        user.setFirstName(userRequest.getFirstname());
        user.setLastname(userRequest.getLastname());
        user.setMidName(userRequest.getMidname());
        user.setEmail(userRequest.getEmail());
        user.setUsername(userRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setPhone(userRequest.getPhoneNumber());
        user.setFaxNo(userRequest.getFaxNo());
        user.setCompanyName(userRequest.getCompanyName());
        user.setActive(userRequest.getStatus());
        user.setReferance(userRequest.getReferenceName());
        user.setUserId(UUID.randomUUID());
        user.setRemark(userRequest.getRemark());
        user.setCreateBy("System");
        user.setUpdated(new Timestamp(new Date().getTime()));
        user.setCreated(new Timestamp(new Date().getTime()));


        Optional<User> dbUser = userRepository.findByEmail(user.getEmail());
        if (dbUser.isPresent()) {
            throw new UserAlreadyExistsException("User with username " + user.getUsername() + " already exists");
        }
        return userRepository.save(user);

    }

}
