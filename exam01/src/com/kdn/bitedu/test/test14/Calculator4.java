package com.kdn.bitedu.test.test14;

import com.kdn.bitedu.test.test06.Calculator;

/* 예외처리 문법을 활용한 방식
 * - 예외 정보를 객체에 담아서 호출자에게 전달한다.
 * - Throwable 클래스 : 예외 정보를 담는 클래스
 * - 예외를 전달하는 명령어: throw 예외정보를담은객체
 * - 예외를 던지는 메서드는 어떤 예외를 던지는지 메서드 선언부에 표시해야 한다.
 *   void 메서드명(..) throws 예외를담은객체의클래스명, .., ... { } 
*/
public class Calculator4 extends Calculator {
  public void modular(int a) {
    result %= a;
  }
  
  public void divide(int a) throws Throwable {
    if (a == 0) {
      throw new Throwable("0으로 나눌 수 없습니다.");
    } else {
      result /= a;
    }
  }
  
  // 예외 처리를 상위 호출자에게 위임하는 예
  public void doubleDivide(int a) throws Throwable {
    // 예외 처리를 상위 호출자에게 전달할 수 밖에 없는 경우 => throws 명령을 선언한다.
    // 굳이 아래와 같이 try 블록을 선언할 필요가 없다. 
    //try {
      divide(a * 2);
    //} catch(Throwable err) {
    //  throw err;
    //}
  }
  
  public int getResult() {
    return result;
  }
}







