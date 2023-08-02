package com.multicampus.demo4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CategoryController {
    @GetMapping("category")
    public String index(){
        return "thumục";
    }
}
