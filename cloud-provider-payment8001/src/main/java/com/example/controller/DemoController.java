package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("demo")
public class DemoController {


    @RequestMapping("test")
    public String test(){
        System.out.println("8001");
        return "8001";
    }
}
