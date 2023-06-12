package com.infosys.medicalapp.security.keycloak;

import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableMethodSecurity(jsr250Enabled = true)
@RestController
@RequestMapping(path = "api/user")
public class KeycloakController {

    @Autowired
    KeycloakService service;

    @PostMapping
    public String addUser(@RequestBody UserDTO userDTO){
        service.addUser(userDTO);
        return "User " + userDTO.getUserName() + " Added Successfully.";
    }

    @GetMapping(path = "/{userName}")
    public List<UserRepresentation> getUser(@PathVariable("userName") String userName){
        List<UserRepresentation> user = service.getUser(userName);
        return user;
    }

    @PutMapping(path = "/update/{userName}")
    public String updateUser(@PathVariable("userName") String userName,   @RequestBody UserDTO userDTO){
        service.updateUser(userName, userDTO);
        return "User Details for user: " + userName + " Updated Successfully.";
    }

    @DeleteMapping(path = "/{userName}")
    public String deleteUser(@PathVariable("userName") String userName){
        service.deleteUser(userName);
        return "User" + userName +  " Deleted Successfully.";
    }
}
