package com.mariuszilinskas.vsp.userservice.exception;

import java.util.UUID;

public class UserRegistrationException extends RuntimeException {

    public UserRegistrationException(UUID userId) {
        super(String.format("Failed to register User [userId = '%s'] and send verification email.", userId));
    }
}
