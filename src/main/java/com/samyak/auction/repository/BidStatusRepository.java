package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.BidStatus;

public interface BidStatusRepository extends CrudRepository<BidStatus, Long> {

}
