package com.idoceb00.marketsimulator.users.domain.port.outbound;

import com.idoceb00.marketsimulator.users.domain.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository {
  User save(User user);

  Optional<User> findById(UUID id);

  Page<User> findAll(Pageable pageable);

  void deleteById(UUID id);

  boolean existsById(UUID id);
}
