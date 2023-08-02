package com.multicampus.demo4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home";
    }
//    @GetMapping("/hello")
//    public String hello((name)){
//
//        modal.addAttribute("anhyeuem", name);
//        return "hello";
//    }
    @GetMapping("/form")
    public String form(){
        return "form";
    }
}
