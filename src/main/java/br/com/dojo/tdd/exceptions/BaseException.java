package br.com.dojo.tdd.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public abstract class BaseException extends RuntimeException {
    private final HttpStatus status;
    private final String message;
}
