<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
	<%
	BoardVO board = (BoardVO) request.getAttribute("brd");
	int paging = (int) request.getAttribute("page");
	%>
	<h3>상세페이지(board.jsp)</h3>
	<form action="modifyForm.do">
	    <input type="hidden" name="bno" value="<%=board.getBoardNo()%>">
	    <input type="hidden" name="page" value="<%=paging%>">
		<table class="table">
			<tr>
				<th>글번호</th>
				<td><%=board.getBoardNo()%></td>
				<th>글쓴이</th>
				<td><%=board.getWriter()%></td>
			</tr>
			<tr>
				<th>글제목</th>
				<td colspan="3"><%=board.getTitle()%></td>
			</tr>
			<tr>
				<th>글내용</th>
				<td colspan="3"><textarea style="form-control" cols="25" rows="3" readonly><%=board.getContent()%></textarea></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td colspan="3"><%=board.getWriteDate()%></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<button type="submit" class="btn btn-warning">수정</button>
	                <button type="button" class="btn btn-danger">삭제</button>
				</td>
			</tr>
		</table>
    </form>
    <p><a href="boardList.do">목록이동</a></p>
    <script>
        document.querySelector('button.btn.btn-danger').addEventListener('click', function() {
            location.href = "deleteForm.do?bno=<%=board.getBoardNo()%>&page=<%=paging%>";
        });
    </script>
	
	<ul>
		<li>글번호: <%=board.getBoardNo()%></li>
		<li>글제목: <%=board.getTitle()%></li>
		<li>글내용: <%=board.getContent()%></li>
		<li>글쓴이: <%=board.getWriter()%></li>
		<li>작성일: <%=board.getWriteDate()%></li>
	</ul>
<jsp:include page="includes/footer.jsp"></jsp:include>