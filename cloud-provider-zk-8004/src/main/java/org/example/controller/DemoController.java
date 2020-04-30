package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("zk")
@Slf4j
public class DemoController {

    @Resource
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @RequestMapping("test")
    public String test(){
        log.info(port);
        return port;
    }
    @RequestMapping("dis")
    public Object discovery(){
        List<String> services=discoveryClient.getServices();
        for(String str:services){
            log.info("element:{}",str);
        }
//        PAYMENT8001
        List<ServiceInstance> list=discoveryClient.getInstances("PAYMENT8001");
        for(ServiceInstance s:list){
            log.info(s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return discoveryClient;
    }

}
