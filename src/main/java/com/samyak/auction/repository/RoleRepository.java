package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Role;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

    Optional<Role> findByRoleId(UUID roleId);

}
