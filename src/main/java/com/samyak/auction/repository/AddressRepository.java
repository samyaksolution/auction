package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Address;


public interface AddressRepository extends CrudRepository<Address, Long> {

}
