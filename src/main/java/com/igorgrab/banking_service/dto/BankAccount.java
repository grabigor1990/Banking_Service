package com.igorgrab.banking_service.dto;

import com.igorgrab.banking_service.enums.AccountStatus;
import com.igorgrab.banking_service.enums.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType accountType;
    private AccountStatus accountStatus;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
