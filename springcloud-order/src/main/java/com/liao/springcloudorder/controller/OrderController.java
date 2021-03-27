package com.liao.springcloudorder.controller;

import com.liao.springcloudorder.controller.client.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @autuor sufei
 * @date 2018/11/9 11:40
 */
@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("orderList")
    public String orderList() {
        return userServiceClient.add();
    }
}
