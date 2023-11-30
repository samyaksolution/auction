package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.LotItem;

public interface LotItemRepository extends CrudRepository<LotItem, Long> {

}
