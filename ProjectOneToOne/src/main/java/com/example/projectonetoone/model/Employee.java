package com.example.projectonetoone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String dept;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_Sal",referencedColumnName = "id")
    private EmpSalary emps;
}
