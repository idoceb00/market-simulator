package com.idoceb00.marketsimulator.users.domain;

import java.util.UUID;
import lombok.Getter;

@Getter
public class User {

  private final UUID id;
  private String name;
  private String email;

  private User(UUID id, String name, String email) {
    this.id = id;
    setName(name);
    setEmail(email);
  }

  public static User create(String name, String email) {
    return new User(UUID.randomUUID(), name, email);
  }

  public void setName(String name) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("ERROR: User name cannot be blank");
    }

    this.name = name.trim();
  }

  public void setEmail(String email) {
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("ERROR: User email cannot be blank");
    }

    if (!email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
      throw new IllegalArgumentException("ERROR: User email format is invalid");
    }

    this.email = email;
  }
}
