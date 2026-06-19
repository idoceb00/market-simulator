package com.idoceb00.marketsimulator.users.domain.port.inbound;

import com.idoceb00.marketsimulator.users.application.dto.CreateUserRequest;
import com.idoceb00.marketsimulator.users.domain.User;

public interface CreateUserUseCase {
  User createUser(CreateUserRequest request);
}
