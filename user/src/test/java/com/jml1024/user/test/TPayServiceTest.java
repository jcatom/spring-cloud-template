package com.jml1024.user.test;

import com.jml1024.Launcher;
import com.jml1024.core.domain.TPay;
import com.jml1024.core.service.TPayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest(classes = Launcher.class)
public class TPayServiceTest {

    @Autowired
    private TPayService tPayService;

    @Test
    public void test_insert() {
        TPay tPay = new TPay();
        tPay.setPayNo("1233333");
        tPay.setOrderNo("1222222");
        tPay.setUserId(1L);
        tPay.setAmount(new BigDecimal("9.99"));
        tPay.setDeleted(false);
        tPay.setCreateDateTime(LocalDateTime.now());
        tPayService.insert(tPay);
    }
}
