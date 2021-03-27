package com.liao.springcloudorder.controller.client;

import org.springframework.stereotype.Component;

/**
 * @autuor sufei
 * @date 2018/11/10 14:49
 */
@Component
public class MyHystrix implements UserServiceClient {

    @Override
    public String add() {
        return "1";
    }
}
