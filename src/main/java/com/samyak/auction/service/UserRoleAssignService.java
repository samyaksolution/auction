package com.samyak.auction.service;

import com.samyak.auction.domain.Role;
import com.samyak.auction.domain.UserRoleAssign;
import com.samyak.auction.repository.RoleRepository;
import com.samyak.auction.repository.UserRoleAssignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;


@Service
public class UserRoleAssignService implements IUserRoleAssign {

    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private UserRoleAssignRepository userRoleAssignRepository;

    public void save(UUID userId, String roleName) {
        Optional<Role> role = roleRepository.findByName(roleName);
        if (role.isEmpty()) {
            throw new IllegalArgumentException(String.format("roleName %s not present", roleName));
        }

        UserRoleAssign userRoleAssign = new UserRoleAssign();
        userRoleAssign.setRoleAssignId(UUID.randomUUID());
        userRoleAssign.setUserId(userId);
        userRoleAssign.setRoleId(role.get().getRoleId());
        userRoleAssign.setActive(true);
        userRoleAssign.setCreateBy("System");
        userRoleAssign.setCreated(new Timestamp(new Date().getTime()));
        userRoleAssignRepository.save(userRoleAssign);
    }


    public Optional<UserRoleAssign> getRoleByUserId(UUID userId) {
        return userRoleAssignRepository.getUserRoleByUserId(userId);
    }
}
