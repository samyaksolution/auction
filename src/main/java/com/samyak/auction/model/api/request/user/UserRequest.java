package com.samyak.auction.model.api.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String firstname;
    private String lastname;
    private String midname;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private String faxNo;
    private String companyName;
    private String email2;
    private String role;
    private Boolean status;
}
