package com.igorgrab.banking_service.dto.request;

import java.math.BigDecimal;

public class UtilityPaymentRequest {

    private Long providerId;
    private BigDecimal amount;
    private String referenceNumber;
    private String account;
}
