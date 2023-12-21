package com.samyak.auction.controller;

import com.samyak.auction.service.JwtService;
import com.samyak.auction.service.UserTokenService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

@Service
public class CustomLogoutHandler implements LogoutHandler {

    @Autowired
    private UserTokenService userTokenService;
    @Autowired
    private JwtService jwtService;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

        final String authHeader = request.getHeader("Authorization");
        final String jwt = authHeader.substring(7);
        String username = jwtService.extractUsername(jwt);
        userTokenService.deleteByKey(username);

    }
}
