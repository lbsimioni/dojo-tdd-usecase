package br.com.dojo.tdd.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidStudentNameException extends BaseException {

    public InvalidStudentNameException() {
        super(HttpStatus.BAD_REQUEST, "Student name is invalid!");
    }
}
