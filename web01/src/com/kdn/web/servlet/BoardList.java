package com.kdn.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kdn.web.dao.BoardDao;
import com.kdn.web.vo.Board;

@WebServlet("/board/list")
public class BoardList extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    try {
      BoardDao boardDao = new BoardDao();
      List<Board> list = boardDao.list();
      
      //JSP가 사용할 수 있도록 ServletRequest 보관소에 저장
      request.setAttribute("list", list);
      
      //JSP로 요청을 배달해 줄 객체를 얻는다.
      RequestDispatcher rd = request.getRequestDispatcher("/board/List.jsp");
      //JSP로 실행을 위임한다.
      rd.include(request, response);
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}











