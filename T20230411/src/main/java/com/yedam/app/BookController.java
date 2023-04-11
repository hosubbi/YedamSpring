package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.BookVO;
import com.yedam.service.BookService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BookController {

	@Setter(onMethod_ = @Autowired)
	private BookService bookservice;
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(BookVO book) {
		bookservice.register(book);
		
		
		log.info(book);
		
		return "/book/bookinsert"; // response.sendRedirect();
	}
	
	
	@GetMapping("register")
	public String register() {
		return "/book/bookinsert";
	}
	
	@GetMapping("index")
	public String index() {
		return "/index";
	}
	
}
