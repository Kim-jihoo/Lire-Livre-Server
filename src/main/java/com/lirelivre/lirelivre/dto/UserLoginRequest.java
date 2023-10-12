package com.lirelivre.lirelivre.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.lirelivre.lirelivre.domain.User;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRequest {
	private String userId;
	private String userPassword;
	public User toEntity(String userPassword) {

		return new User(userId, userPassword);
	}


}
