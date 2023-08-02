package com.example.quanlybaiviet.controller;

import com.example.quanlybaiviet.model.Author;
import com.example.quanlybaiviet.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    public AuthorService authorService;

    @GetMapping("/author")
    private List<Author> findAllAuthor(){
        return authorService.getAllAuthor();
    }

}
