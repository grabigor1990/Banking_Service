package com.igorgrab.banking_service.mapper;

import com.igorgrab.banking_service.dto.BankAccount;
import com.igorgrab.banking_service.entity.BankAccountEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class BankAccountMapper extends BaseMapper<BankAccountEntity, BankAccount> {

    @Override
    public BankAccountEntity convertToEntity(BankAccount dto, Object... args) {
        BankAccountEntity entity = new BankAccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "user");
        }
        return entity;
    }

    @Override
    public BankAccount convertToDto(BankAccountEntity entity, Object... args) {
        BankAccount dto = new BankAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "user");
        }
        return dto;
    }

    @Override
    public BankAccountEntity convertToEntity(BankAccountEntity dto, Object... args) {
        return null;
    }

    public List<BankAccountEntity> covertToEntityList(List<BankAccount> bankAccounts) {
        return null;
    }

    public List<BankAccount> covertToDtoList(List<BankAccountEntity> accounts) {
        return null;
    }
}