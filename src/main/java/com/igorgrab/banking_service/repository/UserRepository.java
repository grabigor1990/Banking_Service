package com.igorgrab.banking_service.repository;

import com.igorgrab.banking_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);

}
