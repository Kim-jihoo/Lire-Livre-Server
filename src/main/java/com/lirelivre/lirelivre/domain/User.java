package com.lirelivre.lirelivre.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "USER_NAME", nullable = false)
	private String userName;				// 회원 ID(로그인 시 사용)

	@Column(name = "USER_PASSWORD", nullable = false)
	private String userPassword;			// 비밀번호

	@Column(name = "USER_NICKNAME", nullable = false)
	private String userNickName;			// 닉네임

	@Column(name = "USER_EMAIL", nullable = false)
	private String userEmail;				// 이메일

	@CreatedDate
	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;		// 가입 일자
}
