package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer/consul")
public class Demotroller {
    @Resource
    private RestTemplate restTemplate;
    public static final String URL="http://consul-provider-8005/";

    @RequestMapping("test")
    public String tet(){
        return restTemplate.getForObject(URL+"consul/test",String.class);
    }

}
