package com.samyak.auction.repository;

import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.LotCategory;

public interface LotCategoryRepository extends CrudRepository<LotCategory, Long> {

}
