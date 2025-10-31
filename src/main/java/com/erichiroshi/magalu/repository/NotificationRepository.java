package com.erichiroshi.magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.magalu.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
