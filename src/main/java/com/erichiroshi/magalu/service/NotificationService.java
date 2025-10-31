package com.erichiroshi.magalu.service;

import org.springframework.stereotype.Service;

import com.erichiroshi.magalu.controller.dto.ScheduleNotificationDto;
import com.erichiroshi.magalu.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

}
