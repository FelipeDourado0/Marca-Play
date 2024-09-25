package com.MarcaPlay.api.infra.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
        private String message;
        private int statusCode;
}
