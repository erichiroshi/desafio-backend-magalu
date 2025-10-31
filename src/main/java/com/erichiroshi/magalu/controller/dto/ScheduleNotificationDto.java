package com.erichiroshi.magalu.controller.dto;

import java.time.LocalDateTime;

import com.erichiroshi.magalu.entity.Channel;
import com.erichiroshi.magalu.entity.Notification;
import com.erichiroshi.magalu.entity.Status;

public record ScheduleNotificationDto(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }
}