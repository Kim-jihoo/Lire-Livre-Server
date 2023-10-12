package com.lirelivre.lirelivre.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import com.lirelivre.lirelivre.domain.User;

@AllArgsConstructor
@Getter
public class UserResponse {
	private String userId;
	private String userEmail;

	public UserResponse(User user) {
		this.userId = user.getUserId();
		this.userEmail = user.getUserEmail();
	}
}
