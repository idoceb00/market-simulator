package com.idoceb00.marketsimulator.users.application.dto.mapper;

import com.idoceb00.marketsimulator.users.application.dto.UserResponse;
import com.idoceb00.marketsimulator.users.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

  public UserResponse toResponse(User user) {
    // TODO: map User domain entity to UserResponse DTO
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
