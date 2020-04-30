package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("c/zk")
public class DemoController {
    @Resource
    private RestTemplate restTemplate;
    public static final String INVOKE_URL="http://payment8004";

    @RequestMapping("test")
    public String test(){
        return restTemplate.getForObject(INVOKE_URL+"/zk/test",String.class);
    }


}
