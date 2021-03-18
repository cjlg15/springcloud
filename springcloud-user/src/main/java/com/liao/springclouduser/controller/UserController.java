package com.liao.springclouduser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autuor sufei
 * @date 2018/10/31 17:04
 */
@RestController
public class UserController {

    @GetMapping("test")
    public String test() {
        return "aaa";
    }


}
