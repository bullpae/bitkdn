package com.kdn.bitedu.test.test04;

/* 클래스 변수의 사용 테스트
 */
public class Test04 {

  public static void main(String[] args) {
    //int result = 0; // 로컬 변수는 0으로 자동 초기화 되지 않는다.
    // 계산 예: 10 * 2 + 4
    Calculator.init(10);
    Calculator.multiple(2);
    Calculator.plus(4);
    System.out.println(Calculator.result);
  }

}
