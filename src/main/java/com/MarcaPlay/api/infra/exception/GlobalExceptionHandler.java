package com.MarcaPlay.api.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class})
    private ResponseEntity<ErrorResponse> handleBadRequest() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse("Erro na chamada", 400));
    }

    @ExceptionHandler({Exception.class})
    private ResponseEntity<ErrorResponse> handlerNotFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse("Entidade não encontrada", 404));
    }

    @ExceptionHandler({HttpServerErrorException.InternalServerError.class})
    private ResponseEntity<ErrorResponse> handleGenericException() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse("Ocorreu um erro no servidor.", 500));
    }
}
