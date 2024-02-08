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

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Translator {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSLATOR_ID")
	private Long translatorId;

	@Column(name = "TRANSLATOR_NAME", nullable = false)
	private String translatorName;		// 번역가 이름
}
