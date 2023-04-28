package com.igorgrab.banking_service.mapper;

import com.igorgrab.banking_service.dto.User;
import com.igorgrab.banking_service.entity.BankAccountEntity;
import com.igorgrab.banking_service.entity.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserMapper extends BaseMapper<UserEntity, User>{
   private BankAccountMapper bankAccountMapper = new BankAccountMapper();

   @Override
    public UserEntity convertToEntity(User dto, Object... args) {
       UserEntity entity = new UserEntity();
       if(dto != null) {
           BeanUtils.copyProperties(dto,entity, "accounts");
           entity.setAccounts(bankAccountMapper.covertToEntityList(dto.getBankAccounts()));
       }
       return entity;
   }

   @Override
    public User convertToDto(UserEntity entity, Object... args) {
       User dto = new User();
       if (entity != null) {
           BeanUtils.copyProperties(entity, dto, "accounts");
           dto.setBankAccounts(bankAccountMapper.covertToDtoList(entity.getAccounts()));
       }
       return dto;
   }

    @Override
    public BankAccountEntity convertToEntity(BankAccountEntity dto, Object... args) {
        return null;
    }
}
