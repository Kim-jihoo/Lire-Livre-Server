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
public class BookTranslator {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_TRANSLATOR_ID")
	private Long bookTranslatorId;

	@ManyToOne
	@JoinColumn(name = "BOOK_ID")
	private Book book;					// 도서 ID

	@ManyToOne
	@JoinColumn(name = "TRANSLATOR_ID")
	private Translator translator;		// 번역가 ID
}
