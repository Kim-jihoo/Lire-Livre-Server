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

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookcaseDetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKCASE_DETAIL")
	private Long bookcaseDetailId;

	@ManyToOne
	@JoinColumn(name = "BOOKCASE_ID")
	private Bookcase bookcase;		// 책장 ID

	@ManyToOne
	@JoinColumn(name = "BOOK_ID")
	private Book book;				// 도서 ID
}
