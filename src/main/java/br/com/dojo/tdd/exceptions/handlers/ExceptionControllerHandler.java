package br.com.dojo.tdd.exceptions.handlers;

import br.com.dojo.tdd.exceptions.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<StandardError> baseExceptionHandle(final BaseException ex, final HttpServletRequest request) {
        return ResponseEntity.status(ex.getStatus()).body(
                StandardError.builder()
                        .path(request.getRequestURI())
                        .message(ex.getMessage())
                        .status(ex.getStatus())
                        .build()
        );
    }

}
