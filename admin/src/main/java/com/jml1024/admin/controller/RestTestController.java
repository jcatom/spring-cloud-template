package com.jml1024.admin.controller;

import com.jml1024.admin.dto.TestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/test")
    public void test(@RequestBody TestDTO dto){
        logger.info("test dto:[{}]", dto);
    }
}
