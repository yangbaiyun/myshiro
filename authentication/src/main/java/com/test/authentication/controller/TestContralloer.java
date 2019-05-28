package com.test.authentication.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContralloer {

    @RequestMapping("/")
    public String test()
    {
        return "test";
    }


}
