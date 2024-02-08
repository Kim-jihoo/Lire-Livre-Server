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
public class Hashtag {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HASHTAG")
	private Long hashtagId;

	@Column(name = "HASHTAG_NAME", nullable = false, length = 50)
	private String hashtagName;		// 해시태그 내용
}
