package com.lirelivre.lirelivre.repository;

import com.lirelivre.lirelivre.domain.User;
import com.lirelivre.lirelivre.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserEmail(String UserEmail);

	Optional<User> findByUserId(String UserId);


}


