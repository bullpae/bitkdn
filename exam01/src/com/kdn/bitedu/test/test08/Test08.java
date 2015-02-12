package com.kdn.bitedu.test.test08;

/* 상속 클래스의 사용
 * 수퍼 클래스를 가진 클래스의 인스턴스 생성
 * 1) 수퍼 클래스의 인스턴스 변수를 준비한다.
 */
public class Test08 {

  public static void main(String[] args) {
    // 계산 예1: 10 * 2 + 4 / 0;
    Calculator3 c1 = new Calculator3(); 
    
    c1.init(10);
    c1.multiple(2);
    c1.plus(4);
    c1.divide(0);
    
    System.out.println(c1.getResult());
  }

}









