package com.young.isfj.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }


    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }
}
