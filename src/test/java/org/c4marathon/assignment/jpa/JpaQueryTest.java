package org.c4marathon.assignment.jpa;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.c4marathon.assignment.domain.account.entity.MainAccount;
import org.c4marathon.assignment.domain.account.entity.SaveAccount;
import org.c4marathon.assignment.domain.account.repository.MainAccountRepository;
import org.c4marathon.assignment.domain.account.repository.SaveAccountRepository;
import org.c4marathon.assignment.domain.member.entity.User;
import org.c4marathon.assignment.domain.member.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JpaQueryTest {

	@Autowired
	UserRepository userRepository;

	@Autowired
	MainAccountRepository mainAccountRepository;

	@Autowired
	SaveAccountRepository saveAccountRepository;


	@Test
	void 유저_메인계좌_조회() {
		//given
		User 영태 = User.builder()
			.name("영태")
			.password("1234")
			.email("youngtae@minipay.com")
			.build();

		MainAccount 메인계좌 = MainAccount.builder()
			.mainAccountNumber("1234-567-890123")
			.mainAccountPassword(1234)
			.mainAccountAmount(0L)
			.mainAccountChargeLimit(0L)
			.user(영태)
			.build();

		//when
		User savedUser = userRepository.save(영태);
		MainAccount savedMainAccount = mainAccountRepository.save(메인계좌);

		//then
		assertThat(userRepository.findById(영태.getId()));
		assertThat(mainAccountRepository.findById(메인계좌.getId()));
	}

	@Test
	void 유저_적금계좌_조회() {
		//given
		User 영태 = User.builder()
			.name("영태")
			.password("1234")
			.email("youngtae@minipay.com")
			.build();

		SaveAccount 적금계좌 = SaveAccount.builder()
			.saveAccountNumber("1234-567-890123")
			.saveAccountPassword(1234)
			.saveAccountAmount(0L)
			.user(영태)
			.build();

		//when
		User savedUser = userRepository.save(영태);
		SaveAccount savedSaveAccount = saveAccountRepository.save(적금계좌);

		//then
		assertThat(userRepository.findById(영태.getId()));
		assertThat(saveAccountRepository.findById(적금계좌.getId()));
	}

}
