package com.lirelivre.lirelivre.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lirelivre.lirelivre.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUserEmail(String UserEmail);
	Optional<User> findByUserId(String UserId);
}


