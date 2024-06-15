package org.c4marathon.assignment.domain.account.repository;

import org.c4marathon.assignment.domain.account.entity.MainAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainAccountRepository extends JpaRepository<MainAccount, Long> {
}
