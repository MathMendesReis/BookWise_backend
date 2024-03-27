package com.maths.bookwasy.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorDetails {
    private int status;
    private String error;
    private String message;
}
