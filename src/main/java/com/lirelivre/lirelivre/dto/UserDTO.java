package com.lirelivre.lirelivre.dto;

import com.lirelivre.lirelivre.domain.User;
import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

	private String userId;
	private String userPassword;
	private String userEmail;
	private String user2Password;
	private String userName;
	private String userNickName;


	public User toEntity(String userPassword){

		return new User(this.userId, userPassword, this.userEmail, this.userName, this.userNickName);
	}


}

