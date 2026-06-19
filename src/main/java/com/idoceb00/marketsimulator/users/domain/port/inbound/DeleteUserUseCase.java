package com.idoceb00.marketsimulator.users.domain.port.inbound;

import java.util.UUID;

public interface DeleteUserUseCase {
  void deleteUser(UUID id);
}
