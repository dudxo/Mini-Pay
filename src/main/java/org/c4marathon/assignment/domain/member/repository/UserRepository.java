package org.c4marathon.assignment.domain.member.repository;

import org.c4marathon.assignment.domain.member.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
