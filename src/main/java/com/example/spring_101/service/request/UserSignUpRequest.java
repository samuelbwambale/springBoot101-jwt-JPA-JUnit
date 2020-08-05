package com.example.spring_101.service.request;

/*
Define the UserDTO model class as follows.
It is responsible for getting values from user and passing it to the DAO layer for inserting in database.
 */

public class UserSignUpRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

