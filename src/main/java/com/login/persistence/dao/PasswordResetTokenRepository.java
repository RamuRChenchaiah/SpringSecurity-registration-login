package com.login.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.persistence.model.PasswordResetToken;
import com.login.persistence.model.User;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);

    PasswordResetToken findByUser(User user);

}
