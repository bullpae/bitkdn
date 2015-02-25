<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<html><head><title>게시물 상세보기</title></head><body>
<h1>게시물 상세정보</h1>
<c:choose>
<c:when test="${empty board}">
  <p>해당 게시물을 찾을 수 없습니다!</p>
</c:when>
<c:otherwise>
<form action='update' method='post'>
<table border='1'>
<tr>
<th>번호</th>
<td><input type='text' name='no' readonly value='${board.no}'></td>
</tr>
<tr>
<th>제목</th>
<td><input type='text' name='title' size='50' value='${board.title}'></td>
</tr>
<tr>
<th>내용</th>
<td><textarea name='content' rows='10' cols='60'>${board.content}</textarea></td>
</tr>
<tr>
<th>등록일</th>
<td>${board.createDate}</td>
</tr>
<tr>
<th>조회수</th>
<td>${board.viewCount}</td>
</tr>
</table>
<button>변경</button>
<button type='button' onclick='deleteBoard();'>삭제</button>
</form>
<script>
  function deleteBoard() {
    location.href='delete?no=${board.no}';
  }
</script>  
</c:otherwise>
</c:choose>
</body></html>
