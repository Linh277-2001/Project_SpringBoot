package com.example.studentmanager_25.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_subject")
public class subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tenMon;
    private int term;
    private String count;
}
