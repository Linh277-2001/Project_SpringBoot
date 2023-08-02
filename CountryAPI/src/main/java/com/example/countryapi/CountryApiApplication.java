package com.example.countryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class CountryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryApiApplication.class, args);
    }

}
