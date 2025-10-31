package com.appsdeveloperblog.estore.transfers.controller;

import com.appsdeveloperblog.estore.transfers.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.estore.transfers.model.TransferRestModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/transfers")
@RequiredArgsConstructor
public class TransfersController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final TransferService transferService;

    @PostMapping()
    public boolean transfer(@RequestBody TransferRestModel transferRestModel) {
        return transferService.transfer(transferRestModel);
    }
}
