package com.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.vo.BoardVO;
import com.yedam.common.DataSource;
import com.yedam.mapper.BoardMapper;



public class AppTest {
public static void main(String[] args) {
	SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
	BoardVO board = new BoardVO();
	board.setTitle("메퍼테스트33");
//	board.setContent("메퍼를 활용한 입력 테스트");
//	board.setWriter("newbie");
	board.setBoardNo(6);
	
	try (SqlSession sqlSession = sqlSessionFactory.openSession()){
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int r = mapper.insertBoard(board); //sqlSession.update("com.yedam.mapper.BoardMapper.deleteBoard", board.getBoardNo());
		if(r == 1) {
			System.out.println("등록성공");
			sqlSession.commit();
		} else {
			System.out.println();
			
		}
		List<BoardVO> list = mapper.selectBoard();
		for (BoardVO brd : list) {
			System.out.println(brd.toString());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
