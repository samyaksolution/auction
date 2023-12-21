package com.samyak.auction.controller;

import com.samyak.auction.dto.AuthenticationRequest;
import com.samyak.auction.dto.UserInfo;
import com.samyak.auction.exceptions.UserAlreadyExistsException;
import com.samyak.auction.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;

    @PostMapping("/auth/register")
    public ResponseEntity<?> register(@RequestBody UserInfo request) {
        try {
            AuthenticationResponse response = service.register(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getMessage());
        } catch (UserAlreadyExistsException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());

        }
    }

    @PostMapping("/auth/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest request) {

        try {
            AuthenticationResponse authenticate = service.authenticate(request);
            return ResponseEntity.ok(authenticate);
        } catch (BadCredentialsException ex) {
            ErrorResponse errorResponse = new ErrorResponse("Invalid username or password");
            return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
        }
    }
}
