package com.young.isfj.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/api/v1")
public class SampleApiController {

    @GetMapping(value = "/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        return id;
    }

}