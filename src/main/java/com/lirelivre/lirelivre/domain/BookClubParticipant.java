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
import javax.persistence.OneToOne;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClubParticipant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "club_participant")
	private long clubParticipant;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@Column(name = "is_chief", nullable = false)
	private Boolean isChief;
}
