package com.igorgrab.banking_service.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UtilityPaymentResponse {

    private String message;
    private String transactionId;
}
