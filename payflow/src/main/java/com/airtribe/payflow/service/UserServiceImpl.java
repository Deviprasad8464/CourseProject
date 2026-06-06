package com.airtribe.payflow.service;


import com.airtribe.payflow.Entity.User;
import com.airtribe.payflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {

        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("user not found"+userId));

    }

    @Override
    public User getUserByUpiId(String upiId) {
        return (User) userRepository.findByUpiId(upiId).orElseThrow(() -> new RuntimeException("user not found" + upiId));
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
