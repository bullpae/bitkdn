package com.kdn.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/detail")
public class BoardDetail extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String no = request.getParameter("no");
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>게시물 상세보기</title></head><body>");
    out.println("<h1>게시물 상세정보</h1>");
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          /* JDBC URL */ "jdbc:mysql://localhost:3306/kdndb",
          /* User ID */ "kdn",
          /* User Password */ "123456789");
      stmt = con.createStatement();
      rs = stmt.executeQuery("select bno, title, content, create_date, view from boards"
          + " where bno=" + no);
      
      if(rs.next()) { //DBMS 서버에서 레코드를 하나 가져온다.
        out.println("<form action='update' method='post'>");
        out.println("<table border='1'>");
        
        out.println("<tr>");
        out.println("<th>번호</th>");
        out.println("<td><input type='text' name='no' readonly value='" 
            + rs.getInt("bno") + "'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<th>제목</th>");
        out.println("<td><input type='text' name='title' size='50' value='" 
            + rs.getString("title") + "'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<th>내용</th>");
        out.println("<td><textarea name='content' rows='10' cols='60'>" 
            + rs.getString("content") + "</textarea></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<th>등록일</th>");
        out.println("<td>" + rs.getDate("create_date") + "</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<th>조회수</th>");
        out.println("<td>" + rs.getInt("view") + "</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<button>변경</button>");
        out.println("<button type='button' onclick='deleteBoard();'>삭제</button>");
        out.println("</form>");
        
        out.println("<script>");
        out.println("  function deleteBoard() {");
        out.println("    location.href='delete?no=" + rs.getInt("bno") + "';");
        out.println("  }");
        out.println("</script>");
        
      } else {
        out.println("<p>지정된 번호의 게시물이 없습니다!</p>");
      }
      out.println("</body></html>");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }
  
//  @Override
//  protected void doGet(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//
//    response.setContentType("text/html;charset=UTF-8");
//    PrintWriter out = response.getWriter();
//    
//    out.println("<html>");
//    out.println("<head>");
//    out.println("<title>게시물 목록</title>");
//    out.println("</head>");
//    out.println("<body>");
//    out.println("<h1>게시물 목록</h1>");
//
//    
//    Connection conn = null;
//    Statement stmt = null;
//    ResultSet rs = null;
//    
//    try {
//      //DriverManager.registerDriver("com.mysql.jdbc.Driver.class");
//      Class.forName("com.mysql.jdbc.Driver");
//      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kdndb", "kdn", "123456789");
//      stmt = conn.createStatement();
//      rs = stmt.executeQuery("select bno, title, content, create_date, view from boards");
//      
//      while (rs.next()) {
//        out.println(rs.getInt("bno") + "," 
//            + rs.getString("title") + ","
//            + rs.getString("content") + ","
//            + rs.getDate("create_date") + ","
//            + rs.getInt("view") + "<br>");
//        
//        out.println("</body>");
//        out.println("</htmp>");
//      }
//    } catch (Exception e) {
//      e.printStackTrace();
//    } finally {
//      try {
//        stmt.close();
//        conn.close();
//      } catch (SQLException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//      }
//      
//    }
//    
//    super.doGet(request, response);
//  }
}
