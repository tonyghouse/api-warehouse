package com.ghouse.apibase.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIBaseException> handleException(Exception exp) {
        log.error("Error : {}",exp.getMessage());
        APIBaseException APIBaseException = new APIBaseException(exp.getMessage(), "FAILURE");
        return new ResponseEntity<>(APIBaseException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
