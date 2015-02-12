package com.kdn.bitedu.test.test09;

/* 상속 클래스의 사용
 * 수퍼 클래스를 가진 클래스의 인스턴스 생성
 * 1) 수퍼 클래스의 인스턴스 변수를 준비한다.
 */
public class Test09 {

  public static void main(String[] args) {
    Calculator4 c1 = new Calculator4(); 
    
    c1.init(10);
    c1.plus(4);
    c1.plus(5, 6);
    
    System.out.println(c1.getResult());
  }

}









