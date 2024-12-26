package com.demo.thymeleaf.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductDataBaseException.class)
    public String handleProductDatabaseException(ProductDataBaseException e)
    {
        return e.getMessage();
    }
}
