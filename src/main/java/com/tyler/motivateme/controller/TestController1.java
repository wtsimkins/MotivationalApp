package com.tyler.motivateme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @GetMapping(value = "/hello")
    public String hello(){
        return "world";
    }
}
