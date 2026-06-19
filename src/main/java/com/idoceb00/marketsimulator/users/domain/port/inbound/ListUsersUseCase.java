package com.idoceb00.marketsimulator.users.domain.port.inbound;

import com.idoceb00.marketsimulator.users.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ListUsersUseCase {
  Page<User> listUsers(Pageable pageable);
}
