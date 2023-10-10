package com.lirelivre.lirelivre.service;

import com.lirelivre.lirelivre.config.MemberProfile;
import com.lirelivre.lirelivre.config.OAuthAttributes;
import com.lirelivre.lirelivre.domain.User;
import com.lirelivre.lirelivre.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class OAuth2UserService extends DefaultOAuth2UserService {
	private final UserRepository userRepository;

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

		OAuth2User oAuth2User = super.loadUser(userRequest);

		String registrationId = userRequest.getClientRegistration().getRegistrationId();

		String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails()
			.getUserInfoEndpoint().getUserNameAttributeName();


		Map<String, Object> attributes = oAuth2User.getAttributes();


		MemberProfile memberProfile = OAuthAttributes.extract(registrationId, attributes);

		User user =  saveOrUpdateUserProfile(memberProfile);
		return createDefaultOAuth2User(user, attributes, userNameAttributeName);

	}

	private User saveOrUpdateUserProfile(MemberProfile memberProfile) {

		Optional<User> user = userRepository.findByUserId(memberProfile.getOauthId());
		if(user.isPresent()){
			return user.get();
		}else {
			userRepository.save(memberProfile.toUser());
		}
		return userRepository.save(memberProfile.toUser());
	}


@Transactional
	DefaultOAuth2User createDefaultOAuth2User(User user, Map<String, Object> attributes,
													  String userNameAttributeName) {
		return new DefaultOAuth2User(
			Collections.singletonList(new SimpleGrantedAuthority(user.getUserId())),
			attributes,
			userNameAttributeName
		);
	}
}



