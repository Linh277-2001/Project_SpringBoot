package com.example.quanlybaiviet.service;

import com.example.quanlybaiviet.model.Author;
import com.example.quanlybaiviet.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }
}
