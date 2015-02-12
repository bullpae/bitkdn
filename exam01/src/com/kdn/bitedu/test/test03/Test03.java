package com.kdn.bitedu.test.test03;

/* 클래스 문법의 용도
 * 1) 메서드를 묶는 용도
 * 2) 복합 데이터 타입을 정의하는 용도
 */
public class Test03 {

  public static void main(String[] args) {
    int result = 0;
    // 계산 예: 10 * 2 + 4
    result = Calculator.multiple(10, 2);
    result = Calculator.plus(result, 4);
    System.out.println(result);
  }

}
