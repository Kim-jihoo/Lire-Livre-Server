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
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClub {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_CLUB_ID")
	private Long bookClubId;

	@Column(name = "BOOK_CLUB_NAME", nullable = false)
	private String bookClubName;			// 독서모임 이름

	@Column(name = "BOOK_CLUB_DETAIL", length = 500)
	private String bookClubDetail;			// 독서모임 소개

	@Column(name = "BOOK_CLUB_INTRODUCTION", length = 2000)
	private String bookClubIntroduction;	// 독서모임 상세

	@Column(name = "BOOK_CLUB_REGION", nullable = false)
	private String region;					// 독서모임 지역

	@CreatedDate
	@Column(name = "BOOK_CLUB_CREATED_AT", nullable = false)
	private Date bookClubCreatedAt;			// 독서모임 생성일

	@Column(name = "IS_DONE", nullable = false)
	private boolean isDone;					// 종료 여부

	@Column(name = "IS_PRIVATE", nullable = false)
	private boolean isPrivate;				// 공개 여부

	@Column(name = "IS_ONLINE", nullable = false)
	private boolean isOnline;				// 온라인 여부

	@Column(name = "BOOK_CLUB_PASSWORD")
	private String bookClubPassword;		// 패스워드
}
