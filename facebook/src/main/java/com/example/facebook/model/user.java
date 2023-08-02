package com.example.facebook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;

    @Column(name="user_name", nullable = false, unique = true, length = 50)
    private String userName;

    @Column(name="user_email", nullable = false, unique = true, length = 50)
    private String userEmail;

    @Column(name="user_password", nullable = false, unique = true, length = 50)
    private String userPassword;

    @Column(name="profile_picture", length = 255)
    private String profilePicture;

    @Column(name="bio", columnDefinition = "text")
    private String bio;

    @Column(name="created_at", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private String createdAt;

    @Column(name="updated_at", columnDefinition = "timestamp null default null on update current_timestamp")
    private String updatedAt;
}
