package com.lirelivre.lirelivre.dto;


import com.lirelivre.lirelivre.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRequest {
	private String userId;
	private String userPassword;
	public User toEntity(String userPassword){
		return new User(userId, userPassword);
	}


}
