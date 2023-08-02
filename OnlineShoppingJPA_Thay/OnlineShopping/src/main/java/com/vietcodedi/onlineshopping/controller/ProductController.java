package com.vietcodedi.onlineshopping.controller;

import com.vietcodedi.onlineshopping.model.Product;
import com.vietcodedi.onlineshopping.service.ProductService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping(value = {"", "/"})
    public String index(Model model){
        //Khởi tạo và Lấy data từ ProductService
//        service.initialList();
        List<Product> products = service.getAllProducts();
        //Truyền dữ liệu sang cho Index
        model.addAttribute("products",products);
        return "admin/product/index";
    }
}
