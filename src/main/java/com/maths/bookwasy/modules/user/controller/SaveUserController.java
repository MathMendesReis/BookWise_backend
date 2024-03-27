package com.maths.bookwasy.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maths.bookwasy.modules.user.DTOs.SaveUserRequestDTO;
import com.maths.bookwasy.modules.user.useCases.SaveUserUseCase;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import com.maths.bookwasy.Exceptions.UserAlreadyExistsException;

@RestController
@RequestMapping("/user")
@Tag(name = "Users")
public class SaveUserController {
    @Autowired
    SaveUserUseCase saveUserUseCase;

    @PostMapping("/save")
    @Operation(summary = "Save User", description = "Registra um novo usuário no sistema")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Solicitação inválida"),
            @ApiResponse(responseCode = "409", description = "Usuário já existe"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    public ResponseEntity<?> save(@Valid @RequestBody SaveUserRequestDTO saveUserRequestDTO) {
        ResponseEntity<?> response = null;
        try {
            saveUserUseCase.createUser(saveUserRequestDTO);
            response = ResponseEntity.status(HttpStatus.CREATED).body(null);
        } catch (UserAlreadyExistsException e) {
            response = ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        } catch (Exception e) {
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } finally {
            if (response == null) {
                response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
            }
        }
        return response;
    }
}
