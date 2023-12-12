package com.samyak.auction.model.api.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalInfoRequest {

    private String referenceName;
    private String remark;
}
