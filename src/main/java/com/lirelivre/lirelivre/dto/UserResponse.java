package com.lirelivre.lirelivre.dto;

import com.lirelivre.lirelivre.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResponse{
	private String userId;
	private String userEmail;
	public UserResponse(User user){
		this.userId = user.getUserId();
		this.userEmail = user.getUserEmail();
	}
}


