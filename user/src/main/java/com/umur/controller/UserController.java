package com.umur.controller;

import com.umur.domain.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.umur.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping
    public List<Users> findAll(){
        return userService.findAll();
    }
}
