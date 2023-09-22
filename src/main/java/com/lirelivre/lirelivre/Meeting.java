package com.lirelivre.lirelivre;

import com.lirelivre.lirelivre.domain.Book;
import com.lirelivre.lirelivre.domain.BookClub;
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
import java.sql.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Meeting {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meeting_id")
	private long meetingId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_club_id")
	private BookClub bookClubId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Book bookId;

	@Column(name = "meeting_date", nullable = false)
	private Date meetingDate;

	@Column(name = "meeting_place", nullable = false)
	private String meetingPlace;

	@Column(name = "is_finished", nullable = false)
	private Boolean isFinished;

	@Column(name = "meeting_content")
	private String meetingContent;
}
