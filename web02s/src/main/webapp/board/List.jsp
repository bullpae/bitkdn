<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html><head><title>게시물목록</title></head><body>
<h1>게시물 목록(JSTL(JSP Standard Tag Library) + EL(Expression Language))</h1>
<table border='1'>
<tr>
<th>번호</th>
<th>제목</th>
<th>등록일</th>
<th>조회수</th>
</tr>
<c:forEach var="board" items="${list}">
<tr>
<td>${board.no}</td>
<td><a href='detail?no=${board.no}'>${board.title}</a></td>
<td>${board.createDate}</td>
<td>${board.viewCount}</td>
</tr>
</c:forEach>
</table>
<p><a href='form.html'>[새 글]</a></p>
</body></html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    