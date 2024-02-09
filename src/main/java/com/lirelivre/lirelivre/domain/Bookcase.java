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
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bookcase {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKCASE_ID")
	private Long bookcaseId;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;				// 유저 ID

	@Column(name = "BOOKCASE_NAME", length = 100, nullable = false)
	private String bookcaseName;	// 책장 이름

	@OneToMany(mappedBy = "book")
	private List<Book> books = new ArrayList<>();	// 도서 목록
}
