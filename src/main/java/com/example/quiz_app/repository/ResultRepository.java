package com.example.quiz_app.repository;

import com.example.quiz_app.model.Result;
import com.example.quiz_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByUser(User user);
}

