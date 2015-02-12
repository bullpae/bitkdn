package com.kdn.bitedu.test.test05;

/* 인스턴스 변수
 * - static이 붙지 않은 변수
 * - 인스턴스 변수는 new 연산자를 사용하여 명시적으로 변수를 준비해야 한다.
 * - 어떤 값을 개별적으로 관리해야 한다면 인스턴스 변수로 만들라!
 */
public class Calculator {
  int result; //인스턴스 변수는 0으로 자동 초기화 된다.
  
  public static void init(Calculator instance, int a) {
    instance.result = a;
  }
  
  public static void plus(Calculator instance, int a) {
    instance.result += a;
  }
  
  public static void minus(Calculator instance, int a) {
    instance.result -= a;
  }
  
  public static void multiple(Calculator instance, int a) {
    instance.result *= a;
  }
}











