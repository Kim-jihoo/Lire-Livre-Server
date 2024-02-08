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
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookRecord {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_RECORD_ID")
	private Long bookRecordId;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User userId;			// 유저 ID

	@ManyToOne
	@JoinColumn(name = "BOOK_ID")
	private Book bookId;			// 도서 ID

	@Column(name = "RECORD_START_DATE", nullable = false)
	private Date recordStartDate;	// 독서 시작일

	@Column(name = "RECORD_END_DATE")
	private Date recordEndDate;		// 독서 종료일

	@Column(name = "RECORD_SCORE")
	private int recordScore;		// 점수
}
