package com.example.projectaop1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Learner {
    private Long id;
    private String name;
    private boolean gender;
    private String university;
    private double javacore, frontend, project;

}
