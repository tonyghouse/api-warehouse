package com.ghouse.apiwarehouse.exception;

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
    public ResponseEntity<APIWarehouseException> handleException(Exception exp) {
        log.error("Error : {}",exp.getMessage());
        APIWarehouseException APIWarehouseException = new APIWarehouseException(exp.getMessage(), "FAILURE");
        return new ResponseEntity<>(APIWarehouseException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
