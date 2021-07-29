package br.com.dojo.tdd.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidGradeProofException extends BaseException {

    public InvalidGradeProofException() {
        super(HttpStatus.BAD_REQUEST, "The grade of proof is invalid! The grade must be between 0 and 10.");
    }
}
