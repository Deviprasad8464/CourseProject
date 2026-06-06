package com.airtribe.payflow.service;


import com.airtribe.payflow.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User register(User user);
    List<User> getAllUsers();
}
