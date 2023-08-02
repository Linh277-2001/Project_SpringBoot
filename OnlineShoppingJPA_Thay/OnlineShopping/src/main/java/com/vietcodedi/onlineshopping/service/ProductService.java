package com.vietcodedi.onlineshopping.service;

import com.vietcodedi.onlineshopping.model.Product;
import com.vietcodedi.onlineshopping.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository; //Tiem ProductRe
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

}
