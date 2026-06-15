package com.idoceb00.marketsimulator.users.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final User user = User.create("Percu", "percu@example.com");


    @Test
    void createUserWithValidData() {
        assertEquals("Percu", user.getName());
        assertEquals("percu@example.com", user.getEmail());
    }

    @Test
    void notcreateUserWithBlankName(){
        assertThrows(IllegalArgumentException.class, () -> User.create("", "percu@example.com"));
    }

    @Test
    void notCreateUserWithInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> User.create("Percu", "invalid-email"));
    }

    @Test
    void updateName() {

    }
}