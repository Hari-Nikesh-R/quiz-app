package com.example.quiz_app.services;

import com.example.quiz_app.model.Result;
import com.example.quiz_app.model.User;

import java.util.List;

public interface ResultService {
    Result saveResult(Result result);
    List<Result> findResultsByUser(User user);
}
