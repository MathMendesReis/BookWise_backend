package com.maths.bookwasy.modules.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maths.bookwasy.modules.models.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
