package com.example.managerproduct1.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       //Annotation sinh ra các phương thức getter và setter
@AllArgsConstructor //Tạo hàm khởi tạo có tham số
@NoArgsConstructor  // Tạo hàm khởi tạo không tham số
public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
}