package com.lirelivre.lirelivre.config;

import java.util.Arrays;
import java.util.function.Function;
import java.util.Map;

public enum OAuthAttributes {
	NAVER("naver", attributes -> {
		Map<String, Object> response = (Map<String, Object>) attributes.get("response");
		return new MemberProfile(
			(String) response.get("id"),
			(String) response.get("name"),
			(String) response.get("email")

		);
	}),

	KAKAO("kakao", attributes -> {
		Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
		Map<String, Object> profile = (Map<String, Object>) kakaoAccount.get("profile");
		return new MemberProfile(
			(String) kakaoAccount.get("id"),
			(String) profile.get("name"),
			(String) kakaoAccount.get("email")
		);
	});

	private final String registrationId;
	private final Function<Map<String, Object>, MemberProfile> userProfileFactory;

	OAuthAttributes(String registrationId,
					Function<Map<String, Object>, MemberProfile> userProfileFactory) {
		this.registrationId = registrationId;
		this.userProfileFactory = userProfileFactory;
	}

	public static MemberProfile extract(String registrationId, Map<String, Object> attributes) {
		return Arrays.stream(values())
			.filter(provider -> registrationId.equals(provider.registrationId))
			.findFirst()
			.orElseThrow(IllegalArgumentException::new)
			.userProfileFactory.apply(attributes);
	}

}


