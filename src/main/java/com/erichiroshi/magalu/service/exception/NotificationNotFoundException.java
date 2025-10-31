package com.erichiroshi.magalu.service.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class NotificationNotFoundException extends MagaluException {

    private final String detail;

    public NotificationNotFoundException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, detail);
        pb.setTitle("Notification Not Found");
        pb.setProperty("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        return pb;
    }

}
