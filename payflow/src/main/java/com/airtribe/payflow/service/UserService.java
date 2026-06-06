package com.airtribe.payflow.service;


import com.airtribe.payflow.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User registerUser(User user);

    User getUserById(Long userId);

    User getUserByUpiId(String upiId);
}
