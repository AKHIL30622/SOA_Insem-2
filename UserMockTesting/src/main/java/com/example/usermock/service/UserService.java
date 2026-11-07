package com.example.usermock.service;

import org.springframework.stereotype.Service;
import com.example.usermock.model.User;

@Service
public class UserService {

    public User getUserById(int id) {
        return new User(id, "Akhil");
    }
}
