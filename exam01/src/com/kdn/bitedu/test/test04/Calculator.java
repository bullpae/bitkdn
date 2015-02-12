package com.kdn.bitedu.test.test04;

/* 클래스 변수
 * - 클래스에서 관리하는 변수
 */
public class Calculator {
  static int result; //클래스 변수는 0으로 자동 초기화 된다.
  
  public static void init(int a) {
    result = a;
  }
  
  public static void plus(int a) {
    result += a;
  }
  
  public static void minus(int a) {
    result -= a;
  }
  
  public static void multiple(int a) {
    result *= a;
  }
}











