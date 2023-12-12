package com.samyak.auction.repository;

import com.samyak.auction.domain.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.samyak.auction.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    @Query(value = """
      select u from User u inner join Address a\s
      on u.userId = a.userId\s
      """)
    List<User> findAllUsers();

}
