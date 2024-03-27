package com.maths.bookwasy.modules.user.useCases;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.maths.bookwasy.modules.models.User;
import com.maths.bookwasy.modules.user.DTOs.UpdateUserRequestDTO;
import com.maths.bookwasy.modules.user.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UpdateUserUseCase {

    public final UserRepository userRepository;

    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User updateUser(UUID id, UpdateUserRequestDTO updateUserRequestDTO) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            throw new EntityNotFoundException("User not found with id " + id);
        }
        User user = optionalUser.get();

        if (updateUserRequestDTO.name() != null) {
            user.setName(updateUserRequestDTO.name());
        }
        if (updateUserRequestDTO.avatarUrl() != null) {
            user.setAvatarUrl(updateUserRequestDTO.avatarUrl());
        }
        if (updateUserRequestDTO.email() != null) {
            user.setEmail(updateUserRequestDTO.email());
        }
        return userRepository.save(user);
    }
}
