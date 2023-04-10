package com.yedam.board.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.board.domain.Criteria;
import com.yedam.board.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper replyMapper;
	
	@Test
	public void listTest() {
		Criteria cri = new Criteria(); // 기본값 => pageNum:1 amount:10
		cri.setPageNum(2);
		
		List<ReplyVO> list = replyMapper.getListWithPaging(300L, cri);
		for (ReplyVO vo : list) {
			log.info(vo);
		}
	}
	
	//@Test
	public void readTest() {
		replyMapper.read(7L);
	}
	
	
	//@Test
	public void deleteTest() {
		replyMapper.delete(6L);
	}
	
	//@Test
	public void updateTest() {
		
		ReplyVO vo = new ReplyVO();
		vo.setRno(7L);
		vo.setReply("300번의 수정된 댓글");
		replyMapper.update(vo);
	}
	
	
	//@Test
	public void insertTest() {
		ReplyVO vo = new ReplyVO();
		vo.setReply("댓글등록1");
		vo.setReplyer("user07");
		vo.setBno(300L);
		
		if(replyMapper.insert(vo)==1) {
			log.info("성공");
		} else {
			log.info("실패");
		}
	}
}
