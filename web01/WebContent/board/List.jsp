<%@page import="com.kdn.web.vo.Board"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><title>게시물목록</title></head><body>
<h1>게시물 목록</h1>
<table border='1'>
<tr>
<th>번호</th>
<th>제목</th>
<th>등록일</th>
<th>조회수</th>
</tr>
<%
//BoardList 서블릿이 준비해 준 게시물 목록을 가지고 tr 태그를 생성한다.
List<Board> list = (List<Board>)request.getAttribute("list");

for (Board board : list) {
%>
<tr>
<td><%=board.getNo()%></td>
<td><a href='detail?no=<%=board.getNo()%>'><%=board.getTitle()%></a></td>
<td><%=board.getCreateDate()%></td>
<td><%=board.getViewCount()%></td>
</tr>
<%}%>
</table>
<p><a href='form.html'>[새 글]</a></p>
</body></html>
