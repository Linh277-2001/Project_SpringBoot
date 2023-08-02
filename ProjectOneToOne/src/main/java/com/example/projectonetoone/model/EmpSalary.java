package com.example.projectonetoone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_EmpSalary")
public class EmpSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double salary;
    private double moreSalary;

}
