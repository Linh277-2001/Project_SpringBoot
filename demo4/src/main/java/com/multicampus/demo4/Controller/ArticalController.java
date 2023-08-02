package com.multicampus.demo4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticalController {
    @GetMapping("artical")
    public String index(){
        return "noidung";
    }
}
