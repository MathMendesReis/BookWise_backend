package com.maths.bookwasy.modules.user.DTOs;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SaveUserRequestDTO(
        @Schema(example = "John Doe") @NotNull @NotBlank String name,
        @Schema(example = "https://files.tecnoblog.net/wp-content/uploads/2020/05/avatar-de-facebook-de-mark-zuckerberg-e1589902366337-700x460.png") String avatarUrl,
        @Schema(example = "example@google.com") @Email @NotNull @NotBlank String email,
        @Schema(example = "true") @NotNull Boolean emailVerified) {
}
