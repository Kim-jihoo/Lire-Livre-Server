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
public class BookPublisher {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_PUBLISHER_ID")
	private Long bookPublisherId;

	@ManyToOne
	@JoinColumn(name = "BOOK_ID")
	private Book book;				// 도서 ID

	@ManyToOne
	@JoinColumn(name = "PUBLISHER_ID")
	private Publisher publisher;	// 출판사 ID
}
