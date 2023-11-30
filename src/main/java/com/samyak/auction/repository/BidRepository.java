package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Bid;

public interface BidRepository extends CrudRepository<Bid, Long> {

}
