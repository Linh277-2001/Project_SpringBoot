package com.vietcodedi.onlineshopping.controller;

import com.vietcodedi.onlineshopping.model.Product;
import com.vietcodedi.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping(value = {"", "/"})
    public String index(Model model){
        List<Product> products = service.getAllProducts();
        //Truyền dữ liệu sang cho Index
        model.addAttribute("products",products);
        return "admin/product/index";
    }

//    @GetMapping("/detail/{id}")
//    public String detail(){
//        return ;
//    }
}