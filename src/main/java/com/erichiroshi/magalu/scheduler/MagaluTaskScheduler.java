package com.erichiroshi.magalu.scheduler;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MagaluTaskScheduler {

    @Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)
    public void checkTasks() {
        var dateTime = LocalDateTime.now();
        log.info("Running at {}", dateTime);
    }
}