package br.com.erichiroshi.magalums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_status")
public class Status {

	@Id
	private Long statusId;

	private String description;

	public enum Values {
		PENDING(1L, "pending"),
		SUCCESS(2L, "success"),
		ERROR(3L, "error"), 
		CANCELED(4L, "canceled");

		private Long id;
		private String description;

		Values(Long id, String description) {
			this.id = id;
			this.description = description;
		}

		public Status toStatus() {
			return new Status(id, description);
		}
	}
}
