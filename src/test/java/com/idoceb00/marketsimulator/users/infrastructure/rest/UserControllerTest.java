package com.idoceb00.marketsimulator.users.infrastructure.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.idoceb00.marketsimulator.users.application.dto.mapper.UserDtoMapper;
import com.idoceb00.marketsimulator.users.domain.port.inbound.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

@WebMvcTest(UserController.class)
class UserControllerTest {

  @Autowired private MockMvc mockMvc;

  @Autowired private ObjectMapper objectMapper;

  @MockitoBean private CreateUserUseCase createUserUseCase;

  @MockitoBean private GetUserUseCase getUserUseCase;

  @MockitoBean private UpdateUserUseCase updateUserUseCase;

  @MockitoBean private DeleteUserUseCase deleteUserUseCase;

  @MockitoBean private ListUsersUseCase listUsersUseCase;

  @MockitoBean private UserDtoMapper userDtoMapper;

  @Test
  void createUserReturns201() throws Exception {
    // TODO: send POST /api/v1/users with valid body, expect 201 Created
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void createUserWithInvalidDataReturns400() throws Exception {
    // TODO: send POST /api/v1/users with invalid body, expect 400 Bad Request
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void getUserByIdReturns200() throws Exception {
    // TODO: send GET /api/v1/users/{id}, expect 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void getUserByIdReturns404() throws Exception {
    // TODO: send GET /api/v1/users/{nonExistingId}, expect 404 Not Found
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void updateUserReturns200() throws Exception {
    // TODO: send PUT /api/v1/users/{id} with valid body, expect 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void deleteUserReturns204() throws Exception {
    // TODO: send DELETE /api/v1/users/{id}, expect 204 No Content
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void listUsersReturns200() throws Exception {
    // TODO: send GET /api/v1/users, expect 200 OK
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
