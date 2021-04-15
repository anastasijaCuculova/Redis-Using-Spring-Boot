package com.redis.example.redisdemo.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }
}
