package com.example.quanlybaiviet.service;

import com.example.quanlybaiviet.model.Article;
import com.example.quanlybaiviet.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticle(){
        return articleRepository.findAll();
    }
}
