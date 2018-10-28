package com.firstTrying.springboot.controllers;

import com.firstTrying.springboot.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @RequestMapping("welcome")
    public String welcomeMessage(){
        return service.returnWelcomMessage();
    }

    @RequestMapping(value = "/url/{urlToValidate}", method = RequestMethod.GET)
    public boolean checkURL(@PathVariable("urlToValidate") String url){
        return service.checkURL(url);
    }

}