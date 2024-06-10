package domain.account.entity;

import domain.member.entity.User;
import global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "main_aacounts")
public class MainAccount extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "main_accounts_id", nullable = false)
	private Long mainAccountsId;

	@Column(name = "main_account_number", nullable = false, updatable = false)
	private String mainAccountNumber;

	@Column(name = "main_account_password", nullable = false)
	private int mainAccountPassword;

	@Column(name = "main_account_amount", nullable = false)
	private int mainAccountAmount;

	@Column(name = "main_account_charge_limit", nullable = false)
	private long mainAccountChargeLimit;

	@OneToOne(mappedBy = "mainAccount")
	private User user;

	@Builder
	public MainAccount(String mainAccountNumber, int mainAccountPassword,
						int mainAccountAmount, long mainAccountChargeLimit) {
		this.mainAccountNumber = mainAccountNumber;
		this.mainAccountPassword = mainAccountPassword;
		this.mainAccountAmount = mainAccountAmount;
		this.mainAccountChargeLimit = mainAccountChargeLimit;
	}

}
