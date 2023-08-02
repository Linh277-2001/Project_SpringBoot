package com.multicampus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {
    @GetMapping("hello")
    public String sayHello(){
        return "hello";
    };
    @GetMapping("bye")
    public String sayBye(){
        return "bye";
    }
}
