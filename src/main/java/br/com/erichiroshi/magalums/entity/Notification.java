package br.com.erichiroshi.magalums.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long notificationId;

	private LocalDateTime dateTime;

	private String destination;

	private String message;

	@ManyToOne
	@JoinColumn(name = "channel_id")
	private Channel channel;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;

	public Notification(LocalDateTime dateTime, String destination, String message, Channel channel, Status status) {
		this.dateTime = dateTime;
		this.destination = destination;
		this.message = message;
		this.channel = channel;
		this.status = status;
	}

}
