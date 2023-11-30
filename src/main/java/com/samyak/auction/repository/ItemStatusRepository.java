package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.ItemStatus;

public interface ItemStatusRepository extends CrudRepository<ItemStatus, Long> {

}
