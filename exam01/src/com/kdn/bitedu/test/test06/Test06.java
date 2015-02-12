package com.kdn.bitedu.test.test06;

/* 인스턴스 메서드의 사용
 */
public class Test06 {

  public static void main(String[] args) {
    //int result = 0; // 로컬 변수는 0으로 자동 초기화 되지 않는다.
    // 계산 예1: 10 * 2 + 4
    // 계산 예2: 12 + 3 - 7
    Calculator c1 = new Calculator(); // Calculator에 선언된 인스턴스 변수를 준비하라!
    Calculator c2 = new Calculator(); // Calculator에 선언된 인스턴스 변수를 준비하라!
    
    // 인스턴스 주소를 메서드 앞에 붙인다.
    // 그 메서드가 어떤 클래스인지 어떻게 아는가?
    // - 인스턴스 변수의 선언문을 보면 알 수 있다.
    c1.init(10);
    c2.init(12);
    
    c1.multiple(2);
    c2.plus(3);
    
    c1.plus(4);
    c2.minus(7);
    
    System.out.println(c1.result);
    System.out.println(c2.result);
  }

}
