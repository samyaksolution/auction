package com.samyak.auction.model.api.request.address;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
    private String type;
    private String houseNo;
    private String city;
    private String zipcode;
    private String state;
    private String country;
}
