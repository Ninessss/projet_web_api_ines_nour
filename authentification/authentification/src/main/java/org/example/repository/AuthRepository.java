package org.example.repository;

public class AuthRepository {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }  

    public AuthRepository(String token) {
        this.token = token;
    }
}



