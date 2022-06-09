package com.example.lab.ac2.springclassexercise.controller;

import com.example.lab.ac2.springclassexercise.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:+user");
    }
}
