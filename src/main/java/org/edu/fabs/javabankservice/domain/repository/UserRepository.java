package org.edu.fabs.javabankservice.domain.repository;

import org.edu.fabs.javabankservice.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
