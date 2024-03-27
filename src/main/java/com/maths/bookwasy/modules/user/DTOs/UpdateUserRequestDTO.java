package com.maths.bookwasy.modules.user.DTOs;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;

public record UpdateUserRequestDTO(
                @Schema(example = "Vinicius") String name,
                @Schema(example = "https://files.tecnoblog.net/wp-content/uploads/2020/05/avatar-de-facebook-de-mark-zuckerberg-e1589902366337-700x460.png") String avatarUrl,
                @Schema(example = "vinicius@google.com") @Email String email) {
}
