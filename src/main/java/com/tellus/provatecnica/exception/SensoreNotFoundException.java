package com.tellus.provatecnica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code = HttpStatus.NOT_FOUND, reason = "Sensore non trovato")
public class SensoreNotFoundException extends RuntimeException {
}
