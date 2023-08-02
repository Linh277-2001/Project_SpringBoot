package com.example.quanlybaiviet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ma_tgia")
    private int idCategory;
    @Column(name="ten_tgia")
    private String nameCategory;
    @Column(name="hinh_tgia")
    private String imgCategory;
}
