package com.infosys.medicalapp.security.keycloak;

import lombok.AllArgsConstructor;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.infosys.medicalapp.security.keycloak.KeycloakConfig.*;

@Service
@AllArgsConstructor
public class KeycloakService {

    public void addUser(UserDTO userDTO){
        CredentialRepresentation credential = KeycloakConfig
                .createPasswordCredentials(userDTO.getPassword());
        UserRepresentation user = new UserRepresentation();
        user.setUsername(userDTO.getUserName());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmailId());
        user.setCredentials(List.of(credential));
        user.setEnabled(true);

        // Getting the realm users through the realm resources and creating a new user in the realm resource
        UsersResource instance = resource().users();
        instance.create(user);
    }

    public List<UserRepresentation> getUser(String userName){
        UsersResource usersResource = resource().users();
        List<UserRepresentation> user = usersResource.search(userName, true);
        return user;
    }

    public void updateUser(String userId, UserDTO userDTO){
        CredentialRepresentation credential = KeycloakConfig
                .createPasswordCredentials(userDTO.getPassword());
        UserRepresentation user = new UserRepresentation();
        user.setUsername(userDTO.getUserName());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmailId());
        user.setCredentials(List.of(credential));

        // Getting the realm users through the realm resources and updating the user in the realm resource
        UsersResource usersResource = resource().users();
        usersResource.get(userId).update(user);
    }

    public void deleteUser(String userId){
        // Getting the realm users through the realm resources and deleting the user from the realm resource
        UsersResource usersResource = resource().users();
        usersResource.get(userId)
                .remove();
    }
}
