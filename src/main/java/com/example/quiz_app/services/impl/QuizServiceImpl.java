package com.example.quiz_app.services.impl;

import com.example.quiz_app.model.Quiz;
import com.example.quiz_app.repository.QuizRepository;
import com.example.quiz_app.services.QuizSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizSerive {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
