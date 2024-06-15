package org.c4marathon.assignment.domain.member.entity;

import org.c4marathon.assignment.domain.account.entity.MainAccount;
import org.c4marathon.assignment.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "users")
public class User extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "users_id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "password", nullable = false)
	private String email;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mainAccountsId", referencedColumnName = "mainAccountsId")
	private MainAccount mainAccount;

	@Builder
	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}
}
