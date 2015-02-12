package com.kdn.bitedu.test.test07;

/* 상속 클래스의 사용
 * 수퍼 클래스를 가진 클래스의 인스턴스 생성
 * 1) 수퍼 클래스의 인스턴스 변수를 준비한다.
 */
public class Test07 {

  public static void main(String[] args) {
    // 계산 예1: 10 * 2 + 4 / 2;
    Calculator2 c1 = new Calculator2(); 
    
    // super 클래스의 메서드 호출
    // - 서브클래스의 인스턴스 변수를 가지고 호출할 수 있다.
    c1.init(10);
    c1.multiple(2);
    c1.plus(4);
    
    // sub 클래스의 메서드 호출
    c1.divide(2);
    
    System.out.println(c1.getResult());
  }

}









