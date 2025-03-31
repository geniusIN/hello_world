package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.Control;
import com.yedam.common.DataSource;
import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

public class AddBoardControl implements Control{

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getMethod().equals("GET")) {
			req.getRequestDispatcher("/WEB-INF/views/addForm.jsp").forward(req,  resp);
		} else if (req.getMethod().equals("POST")) {
			resp.sendRedirect("boardList.do");
		}
	}
}
