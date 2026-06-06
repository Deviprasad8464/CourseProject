package com.airtribe.payflow.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public User registerUser(@RequestBody User user)
    {
        try{
          return userService.register(user);
        }
        catch (Exception e)
        {
            return new Exception("user was not registered")
        }
    }

}
