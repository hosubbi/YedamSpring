package com.yedam.board.control;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import com.yedam.board.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration // 컨트롤 테스트용.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
					"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardControlTest {
	
	// 처리된 결과 페이지, url 패턴 처리 : ApplicationContext
	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc; // url -> control -> .jsp
	
	@Before // 테스트클래스 실행될 때 마다 먼저 호출.
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	//단건 조회
	@Test
	public void getTest() {
		RequestBuilder rb = MockMvcRequestBuilders.get("/board/get")
				.param("bno", "2");

		try {
			String vn = mockMvc.perform(rb)
							   .andReturn()
							   .getModelAndView()
							   .getViewName();
			log.info(vn);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	//목록에서 제거
	//@Test
	public void removeTest() {
		RequestBuilder rb = MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "1");

		try {
			String vn = mockMvc.perform(rb)
							   .andReturn()
							   .getModelAndView()
							   .getViewName();
			log.info(vn);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	//단건 수정
	//@Test
	public void modifyTest() {
		RequestBuilder rb = MockMvcRequestBuilders.post("/board/modify")
				.param("title", "새로운글입니다")
				.param("content", "여긴 글내용입니다")
				//.param("writer", "user07")
				.param("bno", "1");

		try {
			String vn = mockMvc.perform(rb)
							   .andReturn()
							   .getModelAndView()
							   .getViewName();
			log.info(vn);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	//등록
	//@Test
	public void registerTest() {
		RequestBuilder rb = MockMvcRequestBuilders.post("/board/register")
							.param("title", "새로운글입니다")
							.param("content", "여긴 글내용입니다")
							.param("writer", "user07");
		
		try {
			String vn = mockMvc.perform(rb)
							   .andReturn()
							   .getModelAndView()
							   .getViewName();
			log.info(vn);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//전체 목록 조회
	//@Test
	public void listTest() {
		// /board/list
		try {
			ModelMap map = mockMvc.perform(MockMvcRequestBuilders.get("/board/list")) //
					.andReturn()// 처리결과.
					.getModelAndView()// model에 저장된 정보를 처리.
					.getModelMap();
			
			List<BoardVO> list = (List<BoardVO>) map.get("list");
			for(BoardVO vo : list)
				log.info(vo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
