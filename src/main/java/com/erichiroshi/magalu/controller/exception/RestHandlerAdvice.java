package com.erichiroshi.magalu.controller.exception;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.erichiroshi.magalu.service.MagaluException;
import com.erichiroshi.magalu.service.NotificationNotFoundException;

@ControllerAdvice
public class RestHandlerAdvice {

    @ExceptionHandler(MagaluException.class)
    public ProblemDetail handlePicPayException(MagaluException e) {
        return e.toProblemDetail();
    }

    @ExceptionHandler(NotificationNotFoundException.class)
    public ProblemDetail handlePicPayException(NotificationNotFoundException e) {
        return e.toProblemDetail();
    }

}
