package domain.account.entity;

import global.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "save_accounts")
public class SaveAccount extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "save_accounts_id", nullable = false)
	private Long id;

	@Column(name = "save_accounts_number", nullable = false)
	private String saveAccountNumber;

	@Column(name = "save_accounts_password", nullable = false)
	private int saveAccountPassword;

	@Column(name = "save_accounts_amount", nullable = false)
	private int saveAccountAmount;

	@Builder
	public SaveAccount(String saveAccountNumber, int saveAccountPassword, int saveAccountAmount){
		this.saveAccountNumber = saveAccountNumber;
		this.saveAccountPassword = saveAccountPassword;
		this.saveAccountAmount = saveAccountAmount;
	}
}
