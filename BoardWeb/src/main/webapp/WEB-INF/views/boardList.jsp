<%@page import="com.yedam.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  webapp/WEB-INF/views/boardList.jsp -->
	<%
		List<BoardVO> list = (List<BoardVO>) request.getAttribute("blist");
	%>
	<p>게시글 목록</p>
	<table border="2">
		<thead>
			<tr><th>글번호</th><th>제목</th><th>작성자</th><th>작성일시</th></tr>
		</thead>
		<tbody>
		<%for (BoardVO board : list) { %>
			<tr>
				<td><%=board.getBoardNo() %></td>
				<td><a href='board.do?bno='<%=board.getBoardNo() %>'><%=board.getTitle() %></a></td>
				<td><%=board.getWriter() %></td>
				<td><%=board.getWriteDate() %></td>
			</tr>
		<%}%>
		</tbody>
	</table>
</body>
</html>
