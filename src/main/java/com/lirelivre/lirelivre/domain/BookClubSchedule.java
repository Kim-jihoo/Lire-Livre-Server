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
public class BookClubSchedule {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SCHEDULE_ID")
	private Long scheduleId;

	@ManyToOne
	@JoinColumn(name = "BOOK_CLUB_ID")
	private BookClub bookClubId;		// 독서 모임 ID

	@Column(name = "SCHEDULE_TITLE", nullable = false, length = 200)
	private String scheduleTitle;		// 일정 제목

	@Column(name = "SCHEDULE_CONTENT", nullable = false, length = 1000)
	private String scheduleContent;		// 일정 내용

	@Column(name = "SCHEDULE_DATE")
	private LocalDateTime scheduleDate;	// 일정 날짜
}
