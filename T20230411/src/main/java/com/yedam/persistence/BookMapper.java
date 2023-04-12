package com.yedam.persistence;

import java.util.List;

import com.yedam.domain.BookVO;

public interface BookMapper {
	public List<BookVO> bookList(); // 목록.
	
	public int insertBook(BookVO vo);
}
