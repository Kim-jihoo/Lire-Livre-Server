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
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookRecord {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_record_id")
	private long bookRecordId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Book bookId;

	@Column(name = "book_record_content")
	private String content;

	@Column(name = "read_start_date", nullable = false)
	private Date readStartDate;

	@Column(name = "read_end_date")
	private Date readEndDate;

	@Column(name = "review_score")
	private int reviewScore;
}
