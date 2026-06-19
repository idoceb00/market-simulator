package com.idoceb00.marketsimulator.users.application.dto;

import java.util.UUID;

public record UserResponse(UUID id, String name, String email) {}
