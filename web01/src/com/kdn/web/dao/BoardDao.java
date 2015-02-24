package com.kdn.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kdn.web.vo.Board;

public class BoardDao {
  public void insert(Board board) throws Exception {
    Connection con = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          /* JDBC URL */ "jdbc:mysql://localhost:3306/kdndb",
          /* User ID */ "kdn",
          /* User Password */ "123456789");
      stmt = con.createStatement();
      stmt.executeUpdate("insert into boards(title,content,create_date,view)"
          + " value('" + board.getTitle() + "','" + board.getContent() + "',now(),0)");
      
    } catch (Exception e) {
      throw e;
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public List list() throws Exception {
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
      rs = stmt.executeQuery("select bno, title, create_date, view from boards");
      
      Board board = null;
      ArrayList<Board> list = new ArrayList<Board>();
      
      while(rs.next()) { //DBMS 서버에서 레코드를 하나 가져온다.
        board = new Board();
        board.setNo(rs.getInt("bno"));
        board.setTitle(rs.getString("title"));
        board.setCreateDate(rs.getDate("create_date"));
        board.setViewCount(rs.getInt("view"));
        
        list.add(board);
      }
      
      return list;
    } catch (Exception e) {
      throw e;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public Board detail(int no) throws Exception {
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
        Board board = new Board();
        board.setNo(no);
        board.setTitle(rs.getString("title"));
        board.setContent(rs.getString("content"));
        board.setCreateDate(rs.getDate("create_date"));
        board.setViewCount(rs.getInt("view"));
        
        return board;
        
      } else {
        return null;
      }
      
    } catch (Exception e) {
      throw e;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public void update(Board board) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/kdndb",
          "kdn",
          "123456789");
      
      stmt = con.prepareStatement(
          "update boards set title=?, content=?, create_date=now() where bno=?");
      
      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContent());
      stmt.setInt(3, board.getNo());
      
      stmt.executeUpdate();
      
    } catch (Exception e) {
      throw e;
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public void delete(int no) throws Exception {
    Connection con = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/kdndb", "kdn", "123456789");
      stmt = con.createStatement();
      stmt.executeUpdate("delete from boards where bno=" + no);
      
    } catch (Exception e) {
      throw e;
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  
}
