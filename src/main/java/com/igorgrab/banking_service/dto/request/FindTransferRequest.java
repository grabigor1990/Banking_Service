package com.igorgrab.banking_service.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FindTransferRequest {

    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;
}
