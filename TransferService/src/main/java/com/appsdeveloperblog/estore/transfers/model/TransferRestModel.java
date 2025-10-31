package com.appsdeveloperblog.estore.transfers.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRestModel {
    private String senderId;
    private String recepientId;
    private BigDecimal amount;
}
