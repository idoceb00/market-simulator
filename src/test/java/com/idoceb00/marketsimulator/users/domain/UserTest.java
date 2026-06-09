package com.idoceb00.marketsimulator.users.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCreateUserWithValidData() {
        User user = new User("Percu", "percu@example.com");

        assertEquals("Percu", user.getName());
        assertEquals("percu@example.com", user.getEmail());
    }
}