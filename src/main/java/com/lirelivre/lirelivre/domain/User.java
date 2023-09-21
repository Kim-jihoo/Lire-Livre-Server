package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_code")
	private long userCode;

	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "user_password", nullable = false)
	private String userPassword;

	@Column(name = "user_nickname", nullable = false)
	private String userNickName;

	@Column(name = "user_email", nullable = false)
	private String userEmail;

	@Column(name = "user_birthday")
	private LocalDate userBirthDay;

	@Column(name = "user_gender")
	private String userGender;

	@Column(name = "user_address")
	private String userAddress;

	@CreatedDate
	@Column(name = "created_at")
	private LocalDateTime createdAt;
}
