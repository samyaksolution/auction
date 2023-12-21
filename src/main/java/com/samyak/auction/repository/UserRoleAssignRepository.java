package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.UserRoleAssign;

import java.util.Optional;
import java.util.UUID;

public interface UserRoleAssignRepository extends CrudRepository<UserRoleAssign, Long> {


    Optional<UserRoleAssign> getUserRoleByUserId(UUID userId);
}
