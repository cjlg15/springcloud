package com.liao.springcloudorder.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @autuor sufei
 * @date 2018/11/9 16:26
 */
@FeignClient(value = "user-service", fallback = MyHystrix.class)
public interface UserServiceClient {

    @GetMapping("user/add")
    String add();
}
