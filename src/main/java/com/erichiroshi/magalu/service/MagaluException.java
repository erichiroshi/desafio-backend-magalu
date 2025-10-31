package com.erichiroshi.magalu.service;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class MagaluException extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("Magulu internal server error");

        pb.setProperty("timestamp", LocalDateTime.now());

        return pb;
    }
}
