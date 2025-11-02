package com.appsdeveloperblog.estore.transfers.model;

import com.appsdeveloperblog.estore.transfers.io.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<TransferEntity, String> {
}
