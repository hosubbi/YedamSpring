package com.yedam.service;

import java.util.List;

import com.yedam.domain.BookVO;

public interface BookService {
	
   public List<BookVO> getList();

	public int register(BookVO vo);
}
