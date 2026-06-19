package com.idoceb00.marketsimulator.users.domain.port.inbound;

import com.idoceb00.marketsimulator.users.domain.User;
import java.util.UUID;

public interface GetUserUseCase {
  User getUserById(UUID id);
}
