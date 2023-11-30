package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.AuctionTag;

public interface AuctionTagRepository extends CrudRepository<AuctionTag, Long> {

}
