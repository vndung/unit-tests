package com.example.unittests;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean authenticate(String username, String password) {
        if ("vnd".equals(username) && "admin".equals(password)) {
            return true;
        }

        return false;
    }
}
