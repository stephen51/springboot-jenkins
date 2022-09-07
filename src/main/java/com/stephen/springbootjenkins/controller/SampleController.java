package com.stephen.springbootjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SampleController {

    @GetMapping("/")
    public String root(){
        return "App is Up and Running";
    }

    @GetMapping("/test")
    public String test(){
        return "Test is Up and Running";
    }
}
