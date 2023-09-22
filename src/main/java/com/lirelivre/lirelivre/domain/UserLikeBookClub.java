package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class UserLikeBookClub {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "like_club_id")
	private long likeClubId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@Column(name = "is_deleted", nullable = false)
	private Boolean isDeleted;
}
