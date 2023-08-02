package com.example.studentmanager_25.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_Bclass")
public class BClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String className;
    private String Teacher;
}
