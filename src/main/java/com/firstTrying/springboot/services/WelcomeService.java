package com.firstTrying.springboot.services;

//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    public String returnWelcomMessage(){
        return "Good Morning To You !! ";
    }
}
