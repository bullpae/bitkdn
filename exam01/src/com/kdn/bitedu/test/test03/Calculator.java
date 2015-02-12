package com.kdn.bitedu.test.test03;

/* 계산기 기능을 묶어두는 클래스*/
/* 접근 제어: public, protected, private, (default)
 * public (모두 공개: 어디에서든 사용할 수 있다)
 * protected(같은 패키지에서만 사용가능, 자식 클래스도 사용가능)
 * (default)(같은 패키지만 사용가능)
 * private(클래스 내부에서만 사용가능)
 */
public class Calculator {
  public static int plus(int a, int b) {
    return a + b;
  }
  
  public static int minus(int a, int b) {
    return a - b;
  }
  
  public static int multiple(int a, int b) {
    return a * b;
  }
}











