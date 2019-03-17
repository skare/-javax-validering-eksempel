package com.kes.javax.validering.eksempel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Du kan ikke bare ha soverom i huset ditt!")
public class KanIkkeBareHaSoveromException extends RuntimeException {
}
