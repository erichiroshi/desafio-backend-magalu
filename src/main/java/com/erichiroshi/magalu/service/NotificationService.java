package com.erichiroshi.magalu.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import com.erichiroshi.magalu.controller.dto.ScheduleNotificationDto;
import com.erichiroshi.magalu.entity.Notification;
import com.erichiroshi.magalu.entity.Status;
import com.erichiroshi.magalu.repository.NotificationRepository;
import com.erichiroshi.magalu.service.exception.NotificationNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Notification findById(Long notificationId) {
        return notificationRepository.findById(notificationId)
                .orElseThrow(() -> new NotificationNotFoundException(String.format(
                        "Notification with ID: %s not found.", notificationId)));
    }

    public void cancelNotification(Long notificationId) {
        Notification notification = findById(notificationId);

        notification.setStatus(Status.Values.CANCELED.toStatus());
        notificationRepository.save(notification);
    }

    public void checkAndSend(LocalDateTime dateTime) {
        var notifications = notificationRepository
                .findByStatusInAndDateTimeBefore(List.of(Status.Values.PENDING.toStatus(), Status.Values.ERROR.toStatus()), dateTime);

        notifications.forEach(sendNotification());
    }

    private Consumer<Notification> sendNotification() {
        return n -> {

            // - REALIZAR O ENVIO DA NOTIFICACAO

            n.setStatus(Status.Values.SUCCESS.toStatus());
            notificationRepository.save(n);
        };
    }
}
