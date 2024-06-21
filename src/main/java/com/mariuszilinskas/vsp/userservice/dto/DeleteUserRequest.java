package com.mariuszilinskas.vsp.userservice.dto;

import jakarta.validation.constraints.NotBlank;

public record DeleteUserRequest(

        @NotBlank(message = "password cannot be blank")
        String password

) {
        public DeleteUserRequest {
                if (password != null) password = password.trim();
        }
}
