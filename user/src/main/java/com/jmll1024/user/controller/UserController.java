package com.jmll1024.user.controller;

import com.jmll1024.user.dto.TestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/list")
    public List<TestDTO> list() {
        TestDTO dto = new TestDTO();
        dto.setOrderAmount("100.00");
        dto.setUserId("123");
        dto.setPayStatus("1");
        dto.setPayTime("2022-12-30 17:05:00");
        dto.setOrderNo(System.currentTimeMillis() + "");
        List<TestDTO> list = new ArrayList<>();
        list.add(dto);
        return list;
    }
}
