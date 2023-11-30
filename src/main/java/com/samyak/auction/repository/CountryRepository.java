package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
