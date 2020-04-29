package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
public class DemoController {

    @Resource
    private RestTemplate restTemplate;
    private static final String URL="http://PAYMENT8001";

    @RequestMapping("test")
    public String test(){
        return restTemplate.getForObject(URL+"/demo/test",String.class);
    }

    @RequestMapping("put")
    public String put(){
        return restTemplate.postForObject(URL+"/demo/test",null,String.class);
    }

    @RequestMapping("test2")
    public String test2() {
        return restTemplate.getForObject(URL + "/demo/test", String.class);
    }

}
