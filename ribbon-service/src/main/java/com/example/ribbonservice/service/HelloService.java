package com.example.ribbonservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "hiError")
//    public String hiService(String name) {
//        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, Object.class).toString();
//    }

    public String hiService(String name) {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi " + name + " there is some problem with hi page";

    }

}
