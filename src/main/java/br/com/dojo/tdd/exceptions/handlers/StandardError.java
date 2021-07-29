package br.com.dojo.tdd.exceptions.handlers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class StandardError {
    public final String path;
    public final String message;
    public final HttpStatus status;
}
