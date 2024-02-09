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
public class Publisher {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PUBLISHER_ID")
	private Long publisherId;

	@Column(name = "PUBLISHER_NAME", nullable = false)
	private Long publisherName;		// 출판사 이름
}
