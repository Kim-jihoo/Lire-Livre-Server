package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private long categoryId;

	@Column(name = "category_name", nullable = false)
	private String categoryName;
}
