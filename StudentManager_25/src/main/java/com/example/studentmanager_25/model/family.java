package com.example.studentmanager_25.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_family")
public class family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fatherName;
    private String motherName;

}
