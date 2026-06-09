package com.idoceb00.marketsimulator.users.domain;


import lombok.Getter;

@Getter
public class User {

    String name;
    String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}
