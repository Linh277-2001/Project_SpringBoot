package com.example.quanlybaiviet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;
    @Column(name = "ma_bviet")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tieude")
    private String title;
    @Column(name = "ten_bhat")
    private String songName;
    @Column(name="tomtat")
    private String summary;
    @Column(name = "noidung")
    private String content;
    @Column(name = "ngayviet")
    private Date dateCreate;
    @Column(name="hinhanh")
    private String image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ma_tloai",referencedColumnName = "ma_tloai")
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ma_tgia",referencedColumnName = "ma_tgia")
    private Author author;

}
