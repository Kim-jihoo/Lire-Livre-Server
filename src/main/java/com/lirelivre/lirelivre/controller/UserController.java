package com.lirelivre.lirelivre.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lirelivre.lirelivre.domain.User;
import com.lirelivre.lirelivre.dto.UserDTO;
import com.lirelivre.lirelivre.dto.UserLoginRequest;
import com.lirelivre.lirelivre.dto.UserLoginResponse;
import com.lirelivre.lirelivre.dto.UserResponse;
import com.lirelivre.lirelivre.service.UserService;



import java.util.Optional;


@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

	private final UserService userService; // 생성자 주입
	private final BCryptPasswordEncoder encoder;


	@PostMapping("/join")
	public ResponseEntity<UserResponse> join(@RequestBody UserDTO userDTO) {
		if (!userDTO.getUserPassword().equals(userDTO.getUser2Password())) {
			throw new IllegalStateException("비밀번호 불일치");
		}
		User join = userService.join(userDTO.toEntity(encoder.encode(userDTO.getUserPassword())));
		UserResponse userResponse = new UserResponse(join);
		return ResponseEntity.ok(userResponse);
	}

	@PostMapping("/login")
	public ResponseEntity<UserLoginResponse> login(@RequestBody UserLoginRequest userLoginRequest) {
		User login = userService.login(userLoginRequest.toEntity(userLoginRequest.getUserPassword()));
		UserLoginResponse userLoginResponse = new UserLoginResponse(login);
		return ResponseEntity.ok(userLoginResponse);
		}

	}


