package com.maths.bookwasy.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maths.bookwasy.user.models.UserModel;

public interface UserREpository extends JpaRepository<UserModel, UUID> {
    
}
