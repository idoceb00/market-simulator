package com.idoceb00.marketsimulator.users.infrastructure.rest;

import com.idoceb00.marketsimulator.users.application.dto.CreateUserRequest;
import com.idoceb00.marketsimulator.users.application.dto.UpdateUserRequest;
import com.idoceb00.marketsimulator.users.application.dto.UserResponse;
import com.idoceb00.marketsimulator.users.application.dto.mapper.UserDtoMapper;
import com.idoceb00.marketsimulator.users.domain.port.inbound.*;
import jakarta.validation.Valid;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  private final CreateUserUseCase createUserUseCase;
  private final GetUserUseCase getUserUseCase;
  private final UpdateUserUseCase updateUserUseCase;
  private final DeleteUserUseCase deleteUserUseCase;
  private final ListUsersUseCase listUsersUseCase;
  private final UserDtoMapper userDtoMapper;

  public UserController(
      CreateUserUseCase createUserUseCase,
      GetUserUseCase getUserUseCase,
      UpdateUserUseCase updateUserUseCase,
      DeleteUserUseCase deleteUserUseCase,
      ListUsersUseCase listUsersUseCase,
      UserDtoMapper userDtoMapper) {
    this.createUserUseCase = createUserUseCase;
    this.getUserUseCase = getUserUseCase;
    this.updateUserUseCase = updateUserUseCase;
    this.deleteUserUseCase = deleteUserUseCase;
    this.listUsersUseCase = listUsersUseCase;
    this.userDtoMapper = userDtoMapper;
  }

  @PostMapping
  public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
    // TODO: call createUserUseCase, map to UserResponse, return 201 Created
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserResponse> getUserById(@PathVariable UUID id) {
    // TODO: call getUserUseCase, map to UserResponse, return 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @PutMapping("/{id}")
  public ResponseEntity<UserResponse> updateUser(
      @PathVariable UUID id, @Valid @RequestBody UpdateUserRequest request) {
    // TODO: call updateUserUseCase, map to UserResponse, return 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
    // TODO: call deleteUserUseCase, return 204 No Content
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @GetMapping
  public ResponseEntity<Page<UserResponse>> listUsers(Pageable pageable) {
    // TODO: call listUsersUseCase, map each User to UserResponse, return 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
