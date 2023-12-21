package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Address;

import java.util.Optional;
import java.util.UUID;


public interface AddressRepository extends CrudRepository<Address, Long> {

    Optional<Address> getAddressByUserId(UUID userId);
}
