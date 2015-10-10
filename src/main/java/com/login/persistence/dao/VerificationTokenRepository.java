package com.login.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.persistence.model.User;
import com.login.persistence.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);

}
