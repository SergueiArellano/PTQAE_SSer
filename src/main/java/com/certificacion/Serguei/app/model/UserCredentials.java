package com.certificacion.Serguei.app.model;

public enum UserCredentials {

    TEST_USER(
            "retoautomationsiigo@yopmail.com",
            "T4b4ck0ff1c3P455w0rd658*"
    );

    private final String email;
    private final String password;

    UserCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
