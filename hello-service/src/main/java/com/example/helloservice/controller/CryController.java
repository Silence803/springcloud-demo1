package com.example.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cry")
public class CryController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/loudly")
    public String loudlyCry(@RequestParam String name) {
        return "oh no! " + name + " was crying loudly!! port:" + port;
    }

    @RequestMapping("/low")
    public String lowVoiceCry(@RequestParam String name) {
        return "oh no! " + name + " was crying in a low voice!! port:" + port;
    }

}
