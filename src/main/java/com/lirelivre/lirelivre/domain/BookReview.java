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
import javax.persistence.ManyToOne;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookReview {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_REVIEW_ID")
	private Long bookReviewId;

	@ManyToOne
	@Column(name = "USER_ID")
	private User user;				// 유저 ID

	@ManyToOne
	@Column(name = "BOOK_ID")
	private Book book;				// 도서 ID

	@Column(name = "REVIEW_SCORE", nullable = false)
	private int reviewScore;		// 리뷰 점수

	@Column(name = "REVIEW_CONTENT", length = 300)
	private String reviewContent;	// 리뷰 내용
}
