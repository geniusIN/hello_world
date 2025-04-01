package com.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DataSource;
import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

public class AppTest {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
        
        BoardVO board = new BoardVO();
        board.setTitle("매퍼테스트44");
        board.setContent("매퍼를활용한입력테스트44");
        board.setWriter("Tester4");
        
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
            
//            int r = mapper.insertBoard(board);
////            int r = sqlSession.update("com.yedam.mapper.BoardMapper.deleteBoard", 2);
//            if (r == 1) {
//                System.out.println("성공했엉~");
//                sqlSession.commit();
//            }
//            else {
//                System.err.println("실패했엉..");
//            }
////            List<BoardVO> list = sqlSession.selectList("com.yedam.mapper.BoardMapper.selectBoard");
            
//            List<BoardVO> list = mapper.selectBoard(1);
//            for (BoardVO b : list) {
//                System.out.println(b.toString());
//            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
