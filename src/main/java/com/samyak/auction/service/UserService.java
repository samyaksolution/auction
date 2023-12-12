package com.samyak.auction.service;

import com.samyak.auction.domain.User;
import com.samyak.auction.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUser {

    private final UserRepository repository;
    
    public void findAllUsers(){
        List<User> allUsers = repository.findAllUsers();

        System.out.print(allUsers);

    }

}
