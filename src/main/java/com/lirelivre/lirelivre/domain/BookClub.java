package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

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
public class BookClub {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_club_id")
	private long bookClubId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category categoryId;

	@Column(name = "book_club_image_url")
	private String bookClubImageUrl;

	@Column(name = "book_club_name", nullable = false)
	private String bookClubName;

	@Column(name = "book_club_explanation")
	private String bookClubExplanation;

	@Column(name = "book_club_detail")
	private String bookClubDetail;

	@CreatedDate
	@Column(name = "book_club_created_at", nullable = false)
	private Date bookClubCreatedAt;

	@Column(name = "is_online", nullable = false)
	private Boolean isOnline;

	@Column(name = "book_club_region")
	private String region;

	@Column(name = "day_of_the_week")
	private String dayOfTheWeek;

	@Column(name = "is_private", nullable = false)
	private Boolean isPrivate;

	@Column(name = "book_club_password")
	private String bookClubPassword;
}
