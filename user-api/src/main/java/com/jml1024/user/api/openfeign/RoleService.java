package com.jml1024.user.api.openfeign;

import com.jml1024.core.dto.TestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "user-provider", contextId = "roleService")
public interface RoleService {

    @GetMapping(value = "/role/list")
    Map list();
}
