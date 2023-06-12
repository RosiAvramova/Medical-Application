package com.infosys.medicalapp.security.keycloak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    //Accepts the user data
    private String userName;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
}
