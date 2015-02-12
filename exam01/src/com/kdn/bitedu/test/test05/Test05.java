package com.kdn.bitedu.test.test05;

/* 인스턴스 변수의 사용
 */
public class Test05 {

  public static void main(String[] args) {
    //int result = 0; // 로컬 변수는 0으로 자동 초기화 되지 않는다.
    // 계산 예1: 10 * 2 + 4
    // 계산 예2: 12 + 3 - 7
    Calculator c1 = new Calculator(); // Calculator에 선언된 인스턴스 변수를 준비하라!
    Calculator c2 = new Calculator(); // Calculator에 선언된 인스턴스 변수를 준비하라!
    
    Calculator.init(c1, 10);
    Calculator.init(c2, 12);
    
    Calculator.multiple(c1, 2);
    Calculator.plus(c2, 3);
    
    Calculator.plus(c1, 4);
    Calculator.minus(c2, 7);
    
    System.out.println(c1.result);
    System.out.println(c2.result);
  }

}
