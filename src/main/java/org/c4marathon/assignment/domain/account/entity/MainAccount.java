package org.c4marathon.assignment.domain.account.entity;

import org.c4marathon.assignment.domain.member.entity.User;
import org.c4marathon.assignment.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "main_accounts")
public class MainAccount extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "main_accounts_id", nullable = false)
	private Long id;

	@Column(name = "main_account_number", nullable = false, updatable = false)
	private String mainAccountNumber;

	@Column(name = "main_account_password", nullable = false)
	private int mainAccountPassword;

	@Column(name = "main_account_amount", nullable = false)
	private long mainAccountAmount;

	@Column(name = "main_account_charge_limit", nullable = false)
	private long mainAccountChargeLimit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "users_id")
	private User user;

	@Builder
	public MainAccount(String mainAccountNumber, int mainAccountPassword,
						long mainAccountAmount, long mainAccountChargeLimit, User user) {
		this.mainAccountNumber = mainAccountNumber;
		this.mainAccountPassword = mainAccountPassword;
		this.mainAccountAmount = mainAccountAmount;
		this.mainAccountChargeLimit = mainAccountChargeLimit;
		this.user = user;
	}

}
