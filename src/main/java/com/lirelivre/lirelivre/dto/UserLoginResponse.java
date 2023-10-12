package com.lirelivre.lirelivre.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import com.lirelivre.lirelivre.domain.User;

@Getter
@AllArgsConstructor
public class UserLoginResponse {
	private String userId;
	private String userPassword;

	public UserLoginResponse(User user) {
		this.userId = user.getUserId();
		this.userPassword = user.getUserPassword();
	}
}
