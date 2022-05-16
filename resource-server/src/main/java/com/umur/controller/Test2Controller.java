package com.umur.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/test2")
public class Test2Controller {

    @GetMapping
    public String get(Principal principal){
        System.out.println(principal);
        return "test TEST";
    }
}
