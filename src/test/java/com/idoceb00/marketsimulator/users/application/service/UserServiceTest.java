package com.idoceb00.marketsimulator.users.application.service;

import com.idoceb00.marketsimulator.users.domain.port.outbound.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

  @Mock private UserRepository userRepository;

  private UserService userService;

  @BeforeEach
  void setUp() {
    userService = new UserService(userRepository);
  }

  @Test
  void createUserWithValidData() {
    // TODO: given valid CreateUserRequest, when createUser, then return created User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void getUserByIdWhenUserExists() {
    // TODO: given existing user id, when getUserById, then return User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void getUserByIdWhenUserDoesNotExist() {
    // TODO: given non-existing user id, when getUserById, then throw UserNotFoundException
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void updateUserWhenUserExists() {
    // TODO: given existing user and valid request, when updateUser, then return updated User
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void updateUserWhenUserDoesNotExist() {
    // TODO: given non-existing user, when updateUser, then throw UserNotFoundException
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void deleteUserWhenUserExists() {
    // TODO: given existing user id, when deleteUser, then verify deletion
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void deleteUserWhenUserDoesNotExist() {
    // TODO: given non-existing user id, when deleteUser, then throw UserNotFoundException
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void listUsersReturnsPagedResults() {
    // TODO: given pageable, when listUsers, then return Page of Users
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
