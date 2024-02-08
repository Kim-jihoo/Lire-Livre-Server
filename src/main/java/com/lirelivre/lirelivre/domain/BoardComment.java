package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
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
public class BoardComment {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOARD_COMMENT_ID")
	private Long boardCommentId;

	@ManyToOne
	@JoinColumn(name = "BOOK_CLUB_ID")
	private BookClubBoard bookClubBoard;		// 게시판 ID

	@Column(name = "BOARD_CONTENT", nullable = false, length = 500)
	private String commentContent;				// 댓글 내용

	@CreatedDate
	private LocalDateTime commentCreatedAt;		// 댓글 생성 시간

	@CreatedBy
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User commentCreatedBy;				// 댓글 작성자

	@LastModifiedDate
	private LocalDateTime commentModifiedAt;	// 댓글 수정 시간
}
