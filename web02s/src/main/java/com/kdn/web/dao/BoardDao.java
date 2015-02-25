package com.kdn.web.dao;

import java.util.List;

import com.kdn.web.vo.Board;

public interface BoardDao {
  void insert(Board board);
  List<Board> list();
  Board detail(int no);
  void update(Board board);
  void delete(int no);
}
