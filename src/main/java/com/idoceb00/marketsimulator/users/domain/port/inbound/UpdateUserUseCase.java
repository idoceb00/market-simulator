package com.idoceb00.marketsimulator.users.domain.port.inbound;

import com.idoceb00.marketsimulator.users.application.dto.UpdateUserRequest;
import com.idoceb00.marketsimulator.users.domain.User;
import java.util.UUID;

public interface UpdateUserUseCase {
  User updateUser(UUID id, UpdateUserRequest request);
}
