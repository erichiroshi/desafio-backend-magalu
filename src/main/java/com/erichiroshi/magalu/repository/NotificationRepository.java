package com.erichiroshi.magalu.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.magalu.entity.Notification;
import com.erichiroshi.magalu.entity.Status;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);

}
