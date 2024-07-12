package br.com.erichiroshi.magalums.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erichiroshi.magalums.entity.Notification;
import br.com.erichiroshi.magalums.entity.Status;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}