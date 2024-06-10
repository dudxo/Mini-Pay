package global.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public abstract class BaseEntity {

	@Column(name = "create_dt", nullable = false, updatable = false)
	private LocalDateTime created;

	@Column(name = "create_dt", nullable = false, updatable = false)
	private LocalDateTime updated;

	@PrePersist
	protected void onCreate() {
		created = LocalDateTime.now();
		onUpdate();
	}

	@PreUpdate
	protected void onUpdate() {
		updated = LocalDateTime.now();
	}
}
