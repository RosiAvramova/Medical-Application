package com.infosys.medicalapp.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @GetMapping("/admin")
    @RolesAllowed("admin")
    public String HelloAdmin(){
        return "You are the admin of the application";
    }

    @GetMapping("/user")
    @RolesAllowed("user")
    public String HelloUser(){
        return "You are an user of the application";
    }

}
