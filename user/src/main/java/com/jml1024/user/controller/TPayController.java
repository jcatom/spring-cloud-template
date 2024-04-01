package com.jml1024.user.controller;

import com.jml1024.core.domain.TPay;
import com.jml1024.core.service.TPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/tpay")
public class TPayController {
    private TPayService tPayService;

    public TPayController(TPayService tPayService) {
        this.tPayService = tPayService;
    }

    @GetMapping(value = "/add")
    public String add() {
        TPay tPay = new TPay();
        tPay.setPayNo("1233333");
        tPay.setOrderNo("1222222");
        tPay.setUserId(1L);
        tPay.setAmount(new BigDecimal("9.99"));
        tPay.setDeleted(false);
        tPay.setCreateDateTime(LocalDateTime.now());
        tPayService.insert(tPay);
        return "success";
    }
}
