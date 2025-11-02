package com.appsdeveloperblog.estore.transfers.io;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "transfers")
public class TransferEntity {
    @Id
    @Column(nullable = false)
    String transferId;

    @Column(nullable = false)
    String senderId;

    @Column(nullable = false)
    String recepientId;

    @Column(nullable = false)
    BigDecimal amount;
}
