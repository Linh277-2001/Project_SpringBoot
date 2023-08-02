package com.example.studentmanager_25.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_learn")
public class learn {
    @Id
    @Column(name = "stid")
    private int stid;

    @Id
    @Column(name = "sbid")
    private int sbid;

    @ManyToOne
    @JoinColumn(name = "stid",referencedColumnName = "id")
    private student student;

    @ManyToOne
    @JoinColumn(name = "sbid",referencedColumnName = "id")
    private student subject;

    private int mark1;

    private int mark2;

}
