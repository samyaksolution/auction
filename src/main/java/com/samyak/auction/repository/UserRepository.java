package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
