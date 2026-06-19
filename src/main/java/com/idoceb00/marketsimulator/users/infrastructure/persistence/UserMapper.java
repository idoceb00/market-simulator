package com.idoceb00.marketsimulator.users.infrastructure.persistence;

import com.idoceb00.marketsimulator.users.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

  public UserJpaEntity toJpaEntity(User user) {
    // TODO: map User domain entity to UserJpaEntity
    throw new UnsupportedOperationException("Not yet implemented");
  }

  public User toDomain(UserJpaEntity entity) {
    // TODO: map UserJpaEntity to User domain entity
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
