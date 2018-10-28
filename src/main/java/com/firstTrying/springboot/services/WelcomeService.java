package com.firstTrying.springboot.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;

@Service
public class WelcomeService {
    public String returnWelcomMessage(){
        return "Good Morning !! ";
    }

    public boolean checkURL(String urlString) {
        HttpURLConnection huc = null;
        int response = 0;
        try {
            urlString = urlString.replace('a', '.');
            //urlString = "https://www.google.co.il/";
            URL u = new URL(urlString);
            huc = (HttpURLConnection) u.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            response = huc.getResponseCode();
        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
            return response == 200;

    }
}
