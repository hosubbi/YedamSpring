package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.BookVO;
import com.yedam.service.BookService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/book/*")
@Log4j
public class BookController {

	@Setter(onMethod_ = @Autowired)
	private BookService bookservice;
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(BookVO book, RedirectAttributes model) {
		log.info("컨트롤 ... 등록");
		// 등록 처리 후 목록이동.
		bookservice.register(book);
		
		model.addFlashAttribute("result", book.getBookName());
		
		return "redirect:/board/list"; // response.sendRedirect();
	}
}
