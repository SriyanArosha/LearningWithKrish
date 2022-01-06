package com.arosha.studentapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value="/greet", method= RequestMethod.GET)
    public String PrintGreeting(){
        return "Hello Springboot";
    }

    @RequestMapping(value="/greet", method= RequestMethod.POST)
    public String PrintGreeting2(){
        return "Hello Springboot from POST";
    }
}
