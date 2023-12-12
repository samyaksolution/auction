package com.samyak.auction.controller;

import com.samyak.auction.exceptions.UserAlreadyExistsException;
import com.samyak.auction.model.api.request.auth.AuthenticationRequest;
import com.samyak.auction.model.api.request.auth.RegisterRequest;
import com.samyak.auction.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        try {
            return ResponseEntity.ok(service.register(request));
        }catch (UserAlreadyExistsException ex){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());

        }
    }

    @PostMapping("/authenticate")
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
