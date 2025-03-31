<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- addform.jsp -->
	<form action="../addBoard">
		<table border="2">
			<tr>
				<th>글제목</th><td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>작성자</th><td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>본문</th><td><textarea name="content" rows="3" cols="40"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit"><input type="reset">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>