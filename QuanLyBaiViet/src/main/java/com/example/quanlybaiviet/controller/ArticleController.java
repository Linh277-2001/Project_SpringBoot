package com.example.quanlybaiviet.controller;

import com.example.quanlybaiviet.model.Article;
import com.example.quanlybaiviet.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    public ArticleService articleService;

    @GetMapping("/article")
    private List<Article> findAllArticle(){
        return articleService.getAllArticle();
    }

}
