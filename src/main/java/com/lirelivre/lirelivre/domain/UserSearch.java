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
import java.sql.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserSearch {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "search_id")
	private long searchId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_code")
	private User userId;

	@Column(name = "search_input", nullable = false)
	private String searchInput;

	@Column(name = "search_date", nullable = false)
	private Date searchDate;

	@Column(name = "is_deleted", nullable = false)
	private Boolean isDeleted;
}
