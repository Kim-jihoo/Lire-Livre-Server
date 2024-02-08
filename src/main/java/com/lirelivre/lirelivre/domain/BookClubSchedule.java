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
public class BookClubWeek {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "week_id")
	private long weekId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@Column(name = "week", nullable = false)
	private String weekDay;
}
