package com.example.quiz_app.services.impl;

import com.example.quiz_app.model.Result;
import com.example.quiz_app.model.User;
import com.example.quiz_app.repository.ResultRepository;
import com.example.quiz_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultRepository resultRepository;

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public List<Result> findResultsByUser(User user) {
        return resultRepository.findByUser(user);
    }
}
