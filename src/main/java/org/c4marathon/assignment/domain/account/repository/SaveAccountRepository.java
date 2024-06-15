package org.c4marathon.assignment.domain.account.repository;

import org.c4marathon.assignment.domain.account.entity.SaveAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveAccountRepository extends JpaRepository<SaveAccount, Long> {
}
