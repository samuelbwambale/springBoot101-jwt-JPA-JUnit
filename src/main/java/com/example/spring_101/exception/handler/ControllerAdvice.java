package com.example.spring_101.exception.handler;

import com.example.spring_101.exception.BusinessException;
import com.example.spring_101.exception.ErrorInfo;
import com.example.spring_101.exception.ResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler({
            IllegalArgumentException.class,
            BusinessException.class,
            ResourceNotFoundException.class,
            EmptyResultDataAccessException.class
    })
    public ResponseEntity<ErrorInfo> handleIllegalException(RuntimeException ex) {
        return ResponseEntity
                .badRequest()
                .body(new ErrorInfo(ex.getMessage()));
    }
}

