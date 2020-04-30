package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consul")
public class DemoController {

    @Value("${server.port}")
    public String port;

    @RequestMapping("test")
    public String test(){
        return port;
    }
}
