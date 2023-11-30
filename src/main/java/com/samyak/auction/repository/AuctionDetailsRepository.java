package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.AuctionDetails;

public interface AuctionDetailsRepository extends CrudRepository<AuctionDetails, Long>
{

}
