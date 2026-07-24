package dev.guirl.EventNow.adapters.input.controllers.dto.response;

import java.time.LocalDateTime;

public record ErrorResponse(
        Integer status,
        String message,
        LocalDateTime timestamp
) {}

