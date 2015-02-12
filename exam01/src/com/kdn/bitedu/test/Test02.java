package com.kdn.bitedu.test;

/*
1. 변수 => 데이터를 저장하기 위한 메모리를 준비하는 명령어
1) primitive 변수
  - 자바에서 제공
  - byte(1), short(2), int(4), long(8)
  - float(4), double(8)
  - char(2)
  - boolean(1)
2) reference 변수
  - 주소를 저장
*/
public class Test02 {
  public static void main(String[] args) {
    int a = 10;
    a = 20;
    
    String s;
    s = new String("가나다"); // 기존 스트링 객체는 garbage가 된다.
    s = new String("1234ABC");
    
    /* Garbage collector
     * 1) CPU가 한가할 때
     * 2) 메모리가 부족할 때(V)
     * - 가비지가 생성된다고 해서 즉시 해제하는 것은 아님.
     */
  }
}







