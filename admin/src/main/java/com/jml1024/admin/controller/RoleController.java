package com.jml1024.admin.controller;

import com.jml1024.user.api.openfeign.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "/list")
    public Map list() {
        return roleService.list();
    }
}
