package com.maths.bookwasy.modules.user.useCases;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.maths.bookwasy.modules.models.User;
import com.maths.bookwasy.modules.user.DTOs.SaveUserRequestDTO;
import com.maths.bookwasy.modules.user.repository.UserRepository;

@Service
public class SaveUserUseCase {
    private final UserRepository userRepository;

    public SaveUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(SaveUserRequestDTO userDto) {
        User user = new User();
        user.setName(userDto.name());
        user.setAvatarUrl(userDto.avatarUrl());
        user.setEmail(userDto.email());
        user.setEmailVerified(userDto.emailVerified());
        user.setCreatedAt(new Date());
        return userRepository.save(user);
    }
}
