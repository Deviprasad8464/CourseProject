package com.airtribe.payflow.service;


import com.airtribe.payflow.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User register(User user);
}
