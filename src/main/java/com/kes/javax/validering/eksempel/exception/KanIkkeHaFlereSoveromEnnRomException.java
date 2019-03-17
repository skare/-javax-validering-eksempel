package com.kes.javax.validering.eksempel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Du kan ikke ha flere soverom enn totalt antall rom!")
public class KanIkkeHaFlereSoveromEnnRomException extends RuntimeException {
}
