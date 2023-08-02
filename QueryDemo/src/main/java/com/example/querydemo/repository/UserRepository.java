package com.example.querydemo.repository;

import com.example.querydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByHp(int hp);

    @Query("SELECT u FROM User u  where u.def=?1 ORDER BY RAND() LIMIT 1")
    User findUserByDef(Integer def);
}
