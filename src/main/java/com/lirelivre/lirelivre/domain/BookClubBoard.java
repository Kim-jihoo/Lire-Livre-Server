package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookClubBoard {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_CLUB_BOARD_ID")
	private Long bookClubBoardId;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;					// 유저 ID

	@ManyToOne
	@JoinColumn(name = "BOOK_CLUB_ID")
	private BookClub bookClub;			// 독서모임 ID

	@Column(name = "BOARD_TITLE", nullable = false, length = 100)
	private String boardTitle;			// 게시판 글 제목

	@Column(name = "BOARD_CONTENT", nullable = false, length = 1000)
	private String boardContent;		// 게시판 글 내용

	@Column(name = "IS_ANNOUNCEMENT", nullable = false)
	private boolean isAnnouncement;		// 공지사항 여부

	@CreatedDate
	@Column(name = "BOARD_CREATED_AT")
	private LocalDateTime createdAt;	// 게시판 글 생성일

	@LastModifiedDate
	@Column(name = "BOARD_MODIFIED_AT")
	private LocalDateTime modifiedAt;	// 게시판 글 수정일
}
