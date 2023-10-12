package com.lirelivre.lirelivre.service;

import java.util.Optional;

import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.lirelivre.lirelivre.domain.User;
import com.lirelivre.lirelivre.repository.UserRepository;


@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
	private final UserRepository userRepository;

	@Transactional
	public User join(User user) {
		Optional<User> findEmail = userRepository.findByUserEmail(user.getUserEmail());
		Optional<User> findId = userRepository.findByUserId(user.getUserId());
		if (findEmail.isPresent()) {
			throw new IllegalStateException("이미 계정이 있습니다.");
		}
		if (findId.isPresent()) {
			throw new IllegalStateException("중복된 아이디");
		}
		userRepository.save(user);
		return user;
	}


	public User login(User user) {
		Optional<User> loginId = userRepository.findByUserId(user.getUserId());
		if (loginId.isPresent()) { //존재하면 로그인 처리
			return user;
		}
		throw new IllegalStateException("아이디가 없습니다");
	}
}

