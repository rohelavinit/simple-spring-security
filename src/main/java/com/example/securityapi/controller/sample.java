package com.example.securityapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String home(){
        return "Hello Spring";
    }
}
