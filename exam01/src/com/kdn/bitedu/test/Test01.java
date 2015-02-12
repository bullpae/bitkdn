package com.kdn.bitedu.test;

import java.util.Date;

import com.kdn.bitedu.domain.Board;

public class Test01 {

  public static void main(String[] args) {
    int age = 30;
    
    //new Board() => Board 설계도에 따라 메모리를 준비하라!
    //Board board => Board 메모리의 주소를 저장할 주소 변수(레퍼런스)를 준비하라!
    Board board = new Board();
    board.no = 1;
    board.title = "hello";
    board.content = "내용...";
    board.viewCnt = 1;
    board.createDate = new Date();

    System.out.println(board.title);
  }

}










