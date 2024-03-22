package com.jmll1024.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @GetMapping(value = "/list")
    public Map list() {
        Map map = new HashMap();
        map.put("name", "Evil");
        return map;
    }
}
