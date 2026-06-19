package com.idoceb00.marketsimulator.users.infrastructure.persistence;

import com.idoceb00.marketsimulator.users.domain.User;
import com.idoceb00.marketsimulator.users.domain.port.outbound.UserRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryAdapter implements UserRepository {

  private final UserJpaRepository jpaRepository;
  private final UserMapper userMapper;

  public UserRepositoryAdapter(UserJpaRepository jpaRepository, UserMapper userMapper) {
    this.jpaRepository = jpaRepository;
    this.userMapper = userMapper;
  }

  @Override
  public User save(User user) {
    // TODO: map domain User to JpaEntity, persist via jpaRepository, map back to domain User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public Optional<User> findById(UUID id) {
    // TODO: find by id via jpaRepository, map to domain User if present
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public Page<User> findAll(Pageable pageable) {
    // TODO: retrieve paginated JpaEntities, map each to domain User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public void deleteById(UUID id) {
    // TODO: delete by id via jpaRepository
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public boolean existsById(UUID id) {
    // TODO: check existence via jpaRepository
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
