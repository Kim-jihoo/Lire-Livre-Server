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
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClubRecruit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "club_recruit_id")
	private long clubRecruitId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@Column(name = "recruit_date")
	private Date recruitDate;

	@Column(name = "min_num_of_recruit")
	private int minNumOfRecruit;

	@Column(name = "max_num_of_recruit")
	private int maxNumOfRecruit;
}
