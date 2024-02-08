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
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClubRecruit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLUB_RECRUIT_ID")
	private Long clubRecruitId;

	@ManyToOne
	@JoinColumn(name = "BOOK_CLUB_ID")
	private BookClub bookClubId;				// 독서모임 ID

	@Column(name = "START_DATE", nullable = false)
	private LocalDateTime recruitStartDate;		// 모집 시작 날짜

	@Column(name = "END_DATE")
	private LocalDateTime recruitEndDate;		// 모집 마감 날짜

	@Column(name = "MIN_NUM_OF_RECRUIT", nullable = false)
	private int minNumOfRecruit;				// 최소 모집 인원

	@Column(name = "MAX_NUM_OF_RECRUIT")
	private int maxNumOfRecruit;				// 최대 모집 인원
}
