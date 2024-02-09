package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClubMember {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_CLUB_MEMBER_ID")
	private Long bookClubMemberId;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;				// 유저 ID

	@ManyToOne
	@JoinColumn(name = "BOOK_CLUB_ID")
	private BookClub bookClubId;	// 독서모임 ID

	@Column(name = "IS_CHIEF", nullable = false)
	private boolean isChief;		// 관리자 여부
}
