package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.Auction;

public interface AuctionRepository extends CrudRepository<Auction, Long> {

}
