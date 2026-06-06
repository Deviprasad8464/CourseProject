package com.airtribe.payflow.controller;


import com.airtribe.payflow.Entity.User;
import com.airtribe.payflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user)
    {
        try{
          User response=userService.registerUser(user);
          return ResponseEntity.ok(response);
        }
        catch (Exception e)
        {
            return ResponseEntity.badRequest().body("User was not registered");
        }
    }

    @GetMapping("/id/{userId}")
   public ResponseEntity<?> getUserById(@PathVariable Long userId)
   {
       try{
           User response=userService.getUserById(userId);
           return  ResponseEntity.ok(response);
       }
       catch (Exception e)
       {
           throw new RuntimeException("user Not Found",e);
       }

   }

   @GetMapping("/upi/{upiId}")
   public ResponseEntity<?> findByUpiId( @PathVariable String upiId)
   {
       try{
           User response=userService.getUserByUpiId(upiId);
           return ResponseEntity.ok(response);
       }
       catch (Exception e)
       {
           throw new RuntimeException("user Not Found",e);
       }
   }

}
