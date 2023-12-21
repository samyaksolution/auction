package com.samyak.auction.service;

import com.samyak.auction.domain.Role;
import com.samyak.auction.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class RoleService implements IRole {

    @Autowired
    private RoleRepository repository;

    public Optional<Role> findRoleByRoleId(UUID roleId){
        return repository.findByRoleId(roleId);
    }



}
