package com.idoceb00.marketsimulator.users.application.service;

import com.idoceb00.marketsimulator.users.application.dto.CreateUserRequest;
import com.idoceb00.marketsimulator.users.application.dto.UpdateUserRequest;
import com.idoceb00.marketsimulator.users.domain.User;
import com.idoceb00.marketsimulator.users.domain.port.inbound.*;
import com.idoceb00.marketsimulator.users.domain.port.outbound.UserRepository;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService
    implements CreateUserUseCase,
        GetUserUseCase,
        UpdateUserUseCase,
        DeleteUserUseCase,
        ListUsersUseCase {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User createUser(CreateUserRequest request) {
    // TODO: validate request, create User via factory method, persist via UserRepository, return
    // created User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public User getUserById(UUID id) {
    // TODO: find User by id via UserRepository, throw UserNotFoundException if not found
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public User updateUser(UUID id, UpdateUserRequest request) {
    // TODO: find existing User, update fields, persist via UserRepository, return updated User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public void deleteUser(UUID id) {
    // TODO: verify User exists, delete via UserRepository
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public Page<User> listUsers(Pageable pageable) {
    // TODO: retrieve paginated list of Users via UserRepository
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
