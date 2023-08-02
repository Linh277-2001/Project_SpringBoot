package com.multicampus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/drink")
    public String showDrinks(){
        return "drink";
    }
}
