package com.kdn.bitedu.test.test14;

import com.kdn.bitedu.test.test06.Calculator;

/* 예외처리 이전 방식
 * - 리턴 값을 통하여 호출자에게 예외 상황을 알린다.
 * - 자세한 상황은 호출자에게 전달할 수 없다.
 * 
*/
public class Calculator3 extends Calculator {
  public void modular(int a) {
    result %= a;
  }
  
  public int divide(int a) {
    if (a == 0) {
      //System.err.println("0으로 나눌 수 없습니다.");
      return -1; 
    } else {
      result /= a;
      return 0;
    }
  }
  
  public int getResult() {
    return result;
  }
}







