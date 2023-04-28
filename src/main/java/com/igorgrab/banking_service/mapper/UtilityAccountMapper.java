package com.igorgrab.banking_service.mapper;

import com.igorgrab.banking_service.dto.UtilityAccount;
import com.igorgrab.banking_service.entity.BankAccountEntity;
import com.igorgrab.banking_service.entity.UtilityAccountEntity;
import org.springframework.beans.BeanUtils;

public class UtilityAccountMapper extends BaseMapper<UtilityAccountEntity, UtilityAccount> {
    @Override
    public UtilityAccountEntity convertToEntity(UtilityAccount dto, Object... args) {
        UtilityAccountEntity entity = new UtilityAccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    @Override
    public UtilityAccount convertToDto(UtilityAccountEntity entity, Object... args) {
        UtilityAccount dto = new UtilityAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }

    @Override
    public BankAccountEntity convertToEntity(BankAccountEntity dto, Object... args) {
        return null;
    }
}
