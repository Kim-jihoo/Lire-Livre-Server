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

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FavoriteCategory {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "favorite_category_id")
	private long favoriteCategoryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category categoryId;
}
