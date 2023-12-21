package com.samyak.auction.repository;

import com.samyak.auction.domain.UserToken;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserTokenRepository extends CrudRepository<UserToken, String> {

    @Modifying
    @Query("DELETE FROM UserToken k WHERE k.key = :key")
    void deleteByKey(String key);
}
