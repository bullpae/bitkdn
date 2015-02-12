package com.kdn.bitedu.test.test14;

/* 예외를 발생시키는 메서드 호출 예
 * 
 * 예외 처리 문법의 존재 이유
 * - 예외 상황을 호출자에게 잘 전달하고 싶다
 * - 예외 처리를 강제화시키기 위해
 * - 예외 상황 발생 시 적절한 조치를 취한 후 계속 시스템을 실행하게 할 수 있다.
 * - 목적 코드와 예외 처리 코드를 분리하여 코드의 가독성을 높이게 한다.
 */
public class Test14 {
  /* 암묵적인 예외를 던지는 메서드 호출 예*/
  public static void main(String[] args) {
    Calculator5 c1 = new Calculator5(); 
    
    c1.init(10);
    c1.plus(4);
    
    try {
      c1.doubleDivide(0);
      
    } catch(Throwable err) {
      System.out.println("나누다가 오류 발생!");
      //err.printStackTrace();
    }
    
    System.out.println(c1.getResult());
  }
  
  /* 예외 처리를 상위 호출자에게 위임하는 예*/
  public static void main03(String[] args) {
    Calculator4 c1 = new Calculator4(); 
    
    c1.init(10);
    c1.plus(4);
    
    //예외 처리를 강제할 수 있다.
    //따라서 다음과 같이 예외 처리를 하지 않으면 오류가 발생한다.
    //예외 처리 문법: try{예외를 던지는 구문} catch(예외를 받는 변수 선언) {예외처리 구문} finally {마무리구문}
    try {
      c1.doubleDivide(0);
      
    } catch(Throwable err) {
      System.out.println("나누다가 오류 발생!");
      err.printStackTrace();
    }
    
    System.out.println(c1.getResult());
  }
  
  
  
  
  /* 예외를 던지는 메서드를 호출하는 예*/
  public static void main02(String[] args) {
    Calculator4 c1 = new Calculator4(); 
    
    c1.init(10);
    c1.plus(4);
    
    //예외 처리를 강제할 수 있다.
    //따라서 다음과 같이 예외 처리를 하지 않으면 오류가 발생한다.
    //예외 처리 문법: try{예외를 던지는 구문} catch(예외를 받는 변수 선언) {예외처리 구문} finally {마무리구문}
    try {
      c1.divide(0);
      
    } catch(Throwable err) {
      System.out.println("나누다가 오류 발생!");
      err.printStackTrace();
    }
    
    System.out.println(c1.getResult());
  }
  
  /* 이전 방식 */
  public static void main01(String[] args) {
    Calculator3 c1 = new Calculator3(); 
    
    c1.init(10);
    c1.plus(4);
    
    if (c1.divide(0) == -1) {
      //윈도우라면, 작은 경고창을 띄운다.
      //콘솔환경이라면, 간단히 문자열로 경고를 출력한다.
      //웹 환경이라면, 웹 브라우저쪽에 간단한 HTML 코드를 보낸다.
    }
    
    System.out.println(c1.getResult());
  }

}









