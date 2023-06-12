package com.infosys.medicalapp.security.keycloak;


import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {

    static Keycloak keycloak = null;

    //Keycloak configuration variables
    private static final String serverUrl = "http://localhost:8080";
    private static final String realm = "SpringBootKeycloak";
    private static final String clientId = "login-app";
    private static final String userName = "admin1";
    private static final String password = "admin";


    public KeycloakConfig() {
    }
    // Create an instance of Keycloak admin account to use
    public static Keycloak getInstance(){
        if(keycloak == null){

            keycloak = KeycloakBuilder.builder()
                    .serverUrl(serverUrl)
                    .realm(realm)
                    .grantType(OAuth2Constants.PASSWORD)
                    .username(userName)
                    .password(password)
                    .clientId(clientId)
                    .resteasyClient(new ResteasyClientBuilder()
                            .connectionPoolSize(10)
                            .build()
                    )
                    .build();
        }
        return keycloak;
    }

    // Get the realm resources through the admin account with getInstance()
    public static RealmResource resource(){
        return getInstance().realm(realm);
    }

    public static CredentialRepresentation createPasswordCredentials(String password) {
        CredentialRepresentation passwordCredentials = new CredentialRepresentation();
        passwordCredentials.setTemporary(false);
        passwordCredentials.setType(CredentialRepresentation.PASSWORD);
        passwordCredentials.setValue(password);
        return passwordCredentials;
    }
}
