package com.erichiroshi.magalu.scheduler;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.erichiroshi.magalu.service.NotificationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MagaluTaskScheduler {

    private final NotificationService notificationService;

    public MagaluTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks() {
        LocalDateTime dateTime = LocalDateTime.now();
        log.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
}