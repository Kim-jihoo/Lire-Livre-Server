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
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_ID")
	private Long bookId;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private Category categoryId;		// 카테고리 ID

	@Column(name = "BOOK_TITLE", nullable = false)
	private String bookTitle;			// 도서 제목

	@Column(name = "BOOK_ISBN", nullable = false)
	private String bookISBN;			// 도서 ISBN

	@Column(name = "BOOK_INTRODUCTION", nullable = false)
	private String bookIntroduction;	// 도서 소개

	@Column(name = "BOOK_URL", nullable = false)
	private String bookUrl;				// 도서 상세 URL

	@Column(name = "PUBLISHING_DATE", nullable = false)
	private Date publishingDate;		// 도서 출판 날짜

	@OneToMany(mappedBy = "book")
	private List<BookPublisher> bookPublishers = new ArrayList<>();		// 도서 출판사 목록

	@OneToMany(mappedBy = "book")
	private List<BookTranslator> bookTranslators = new ArrayList<>();	// 도서 번역가 목록

	@Column(name = "BOOK_PRICE", nullable = false)
	private int bookPrice;				// 도서 정가

	@Column(name = "BOOK_SALE_PRICE", nullable = false)
	private int bookSalePrice;			// 도서 판매가

	@Column(name = "BOOK_THUMBNAIL", nullable = false)
	private String bookThumbnail;		// 도서 썸네일 URL

	@OneToMany(mappedBy = "book")
	private List<BookReview> bookReviews = new ArrayList<>();			// 도서 리뷰 리스트
}
