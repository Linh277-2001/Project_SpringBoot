package com.example.quanlybaiviet.controller;

import com.example.quanlybaiviet.model.Category;
import com.example.quanlybaiviet.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    public CategoryService categoryService;

    @GetMapping("/category")
    private List<Category> findAllCategory(){
        return categoryService.getAllCategory();
    }

}
