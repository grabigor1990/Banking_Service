package com.igorgrab.banking_service.repository;

import com.igorgrab.banking_service.entity.UtilityAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity,Long> {

    Optional<UtilityAccountEntity> findByProviderName(String providerName);
}
