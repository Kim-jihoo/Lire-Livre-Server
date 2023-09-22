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
import javax.persistence.OneToOne;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Presentation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "presentation_id")
	private long presentationId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userId;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "content", nullable = false)
	private String content;
}
