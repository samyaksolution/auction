package com.samyak.auction.model.api.request.auth;

import com.samyak.auction.model.api.request.address.AddressRequest;
import com.samyak.auction.model.api.request.user.AdditionalInfoRequest;
import com.samyak.auction.model.api.request.user.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private UserRequest user;
    private AddressRequest address;
    private AdditionalInfoRequest additionalInfo;
}
