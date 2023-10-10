package com.lirelivre.lirelivre.dto;

import com.lirelivre.lirelivre.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;


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
