package com.lirelivre.lirelivre.config;

import lombok.Getter;

import com.lirelivre.lirelivre.domain.User;
@Getter
public class MemberProfile {
	private final String oauthId;
	private final String name;
	private final String email;
	public MemberProfile(String oauthId, String name, String email) {
		this.oauthId = oauthId;
		this.name = name;
		this.email = email;
	}

	public User toUser() {

		return new User(oauthId,name, email);
	}


}

