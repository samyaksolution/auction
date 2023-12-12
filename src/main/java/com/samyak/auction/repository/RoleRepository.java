package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Role;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
