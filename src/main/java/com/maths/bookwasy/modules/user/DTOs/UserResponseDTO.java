package com.maths.bookwasy.modules.user.DTOs;

import com.maths.bookwasy.modules.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private String name;
    private String email;

    public UserResponseDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
    }

}