package com.example.projectmanytomany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String dept;

    @ManyToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="Emp_skill",
            joinColumns=@JoinColumn(name="IDEmp", referencedColumnName = "id"),
            inverseJoinColumns= @JoinColumn(name="IDSkill",referencedColumnName = "id")

    )
    private Set<Skills> skill= new HashSet<>();

}
