package com.lirelivre.lirelivre.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

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
public class BookRecordDetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_RECORD_DETAIL_ID")
	private Long bookRecordDetailId;

	@ManyToOne
	@JoinColumn(name = "BOOK_RECORD_ID")
	private BookRecord bookRecord;			// 독서 기록장 ID

	@Column(name = "BOOK_RECORD_TITLE", nullable = false, length = 200)
	private String recordTitle;				// 기록 제목

	@Column(name = "BOOK_RECORD_CONTENT", nullable = false, length = 1000)
	private String recordContent;			// 기록 내용

	@Column(name = "IS_PRIVATE", nullable = false)
	private boolean isPrivate;				// 비공개 여부

	@CreatedDate
	@Column(name = "BOOK_RECORD_CREATED_AT")
	private LocalDateTime recordDate;		// 기록 생성 날짜
}
