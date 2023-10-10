package com.lirelivre.lirelivre.domain;

//import com.lirelivre.lirelivre.config.MemberProfile;
import com.lirelivre.lirelivre.dto.UserDTO;



import com.lirelivre.lirelivre.dto.UserLoginRequest;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Setter
@Getter
//@AllArgsConstructor
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

/*
@Getter
public enum UserRole {
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");

	UserRole(String value) {
		this.value = value;
	}

	private String value;

}*/
	public User(String userId, String userPassword, String userEmail, String userName, String userNickName){
		this.userId = userId;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userNickName = userNickName;
	}
	public User(UserDTO userDTO){
		this.userId = userDTO.getUserId();
		this.userPassword = userDTO.getUserPassword();
		this.userEmail = userDTO.getUserEmail();
		this.userName =userDTO.getUserName();
		this.userNickName =userDTO.getUserNickName();
	}

	public User(String userId, String userPassword){
		this.userId = userId;
		this.userPassword = userPassword;
	}
	public User(UserLoginRequest userLoginRequest){
		this.userId = userLoginRequest.getUserId();
		this.userPassword = userLoginRequest.getUserPassword();
	}
	public User(String userId, String userPassword, String userEmail){
		this.userId = userId;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}
}


