package com.samyak.auction.controller;

import com.samyak.auction.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/all")
    public ResponseEntity<String> getAllUsers(){
        userService.findAllUsers();
        return ResponseEntity.ok("Hello from secured endpoint");
    }

}
