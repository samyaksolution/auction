package com.samyak.auction.service;

import com.samyak.auction.domain.UserToken;
import com.samyak.auction.repository.UserTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserTokenService {

    @Autowired
    private UserTokenRepository userTokenRepository;

    public void saveKeyValue(String key, String value) {
        UserToken keyValue = new UserToken();
        keyValue.setKey(key);
        keyValue.setValue(value);
        userTokenRepository.save(keyValue);
    }

    public String getValueByKey(String key) {
        return userTokenRepository.findById(key)
                .map(UserToken::getValue)
                .orElse(null);
    }

    public void deleteByKey(String key) {
        Optional<UserToken> userToken = userTokenRepository.findById(key);
        if (userToken.isPresent()) {
            userTokenRepository.delete(userToken.get());
        }
    }
}
