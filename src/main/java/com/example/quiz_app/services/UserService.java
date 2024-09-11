package com.example.quiz_app.services;

import com.example.quiz_app.model.User;

public interface UserService {
    User saveUser(User user);
    User findByEmail(String email);
}
