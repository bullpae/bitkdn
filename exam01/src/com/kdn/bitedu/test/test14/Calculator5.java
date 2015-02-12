package com.kdn.bitedu.test.test14;

import com.kdn.bitedu.test.test06.Calculator;

/* 예외 처리를 강제화시키지 않고 암묵적으로 요구하는 방법
 * - 강제적이 아니기 때문에 조심해서 사용해야 한다.
 * - 예외 처리나 위임이 번거로울 때 사용한다.
 * 
 * 암묵적으로 예외를 던지는 방법
 * - Error 객체를 던진다. 
 *  - 주로 시스템 예외를 던질 때 사용한다.
 *  - 개발자가 직접 생성하지 말 것. 
 * - RuntimeException 객체를 던진다.
 *  - 실무에서는 RuntimeException을 주로 사용한다.
 *  
 * Throwable
 *   --> Error (V)
 *   --> Exception 
 *          --> RuntimeException (V) 
 * 
*/
public class Calculator5 extends Calculator {
  public void modular(int a) {
    result %= a;
  }
  
  //암묵적인 예외 던지기!
  // - 중간 호출자가 위임하는 코드를 작성하는 번거로움을 없애기 위함.
  // - 단점: 예외 처리를 강제화시킬 수 없다
  public void divide(int a) {
    if (a == 0) {
      throw new RuntimeException("0으로 나눌 수 없습니다.");
    } else {
      result /= a;
    }
  }
  
  
  public void doubleDivide(int a) {
    // divide()는 암묵적인 예외를 던지기 때문에 메서드 선언부에
    // 어떤 예외를 던지는지 선언하지 않아도 된다. => 코딩이 편하다.
    // 편안함에 독이 있다. => 호출자는 예외 처리를 안해도 된다.
    divide(a * 2);
  }
  
  public int getResult() {
    return result;
  }
}







