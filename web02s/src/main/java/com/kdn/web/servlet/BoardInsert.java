package com.kdn.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/board/insert")
public class BoardInsert extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {

    // 한글이 깨지지 않도록 하려면 getParameter()를 최초로 호출하기 전에 
    // 입력 데이터의 인코딩 형식을 설정해야 한다.
    request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    
    Connection conn = null;
    Statement stmt = null;
    
    // Insert DB
    try {
      //DriverManager.registerDriver("com.mysql.jdbc.Driver.class");
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kdndb", "kdn", "123456789");
      stmt = conn.createStatement();
      stmt.executeUpdate("insert into boards(title, content, create_date,view) "
          + "value('" + title + "', '" + content + "', now(), 0)");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        conn.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
    
    // 한글 출력하기
    // 출력 스트림을 얻기 전에 전송할 데이터의 형식과 문자집합을 설정한다.
    response.setContentType("text/html;charset=UTF-8");
    
    // 웹 브라우져로 출력하기
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title> 등록결과</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>등록 성공입니다!</h1>");
    out.println("</body>");
    out.println("</htmp>");
    
    out.println(title);
    out.println(content);

    //System.out.println("TITLE:" + title); 
    //System.out.println("CONTENT:" + content);
  }
}
