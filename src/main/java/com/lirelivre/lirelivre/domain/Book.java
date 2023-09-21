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
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private long bookId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category categoryId;

	@Column(name = "book_name", nullable = false)
	private String bookName;

	@Column(name = "book_author", nullable = false)
	private String bookAuthor;

	@Column(name = "book_page", nullable = false)
	private int bookPage;

	@Column(name = "book_publisher", nullable = false)
	private String bookPublisher;

	@Column(name = "author_comment")
	private String authorComment;

	@Column(name = "publisher_comment")
	private String publisherComment;

	@Column(name = "publishing_date", nullable = false)
	private Date publishingDate;
}
