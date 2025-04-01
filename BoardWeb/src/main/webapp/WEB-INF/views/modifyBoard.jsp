<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
    <%
    BoardVO board = (BoardVO) request.getAttribute("brd");
    int paging = (int) request.getAttribute("page");
    %>
    <h3>수정페이지(modifyBoard.jsp)</h3>
    <form action="modifyBoard.do">
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
                <td colspan="3"><input type="text" name="title" value="<%=board.getTitle()%>"></td>
            </tr>
            <tr>
                <th>글내용</th>
                <td colspan="3"><textarea style="form-control" cols="25" rows="3" name="content"><%=board.getContent()%></textarea></td>
            </tr>
            <tr>
                <th>작성일</th>
                <td colspan="3"><%=board.getWriteDate()%></td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                <button type="submit" class="btn btn-warning">수정</button>
                </td>
            </tr>
        </table>
    </form>
<jsp:include page="includes/footer.jsp"></jsp:include>