package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Lot;

public interface LotRepository extends CrudRepository<Lot,Long> {

}
