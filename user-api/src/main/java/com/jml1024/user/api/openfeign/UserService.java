package com.jml1024.user.api.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user-provider", contextId = "userService")
public interface UserService {

    @GetMapping(value = "/user/list")
    List list();
}
