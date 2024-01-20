package com.maths.bookwasy.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maths.bookwasy.user.dto.CreateUserRequestDTO;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@Tag(name = "user")
public class UserController {

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody CreateUserRequestDTO createUserRequestDTO){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body("");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

        }
    }
}
