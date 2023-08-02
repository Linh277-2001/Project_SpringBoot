package com.example.studentmanager_25.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="IdFamily",referencedColumnName = "id")
    private family family;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "ClassId",referencedColumnName = "id")
    private BClass bclass;
}
