package com.yedam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.domain.BookVO;
import com.yedam.persistence.BookMapper;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public int register(BookVO vo) {
		return bookMapper.insertBook(vo);
	}

}
