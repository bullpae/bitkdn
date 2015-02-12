package com.kdn.bitedu.test.test06;

/* 인스턴스 메서드
 * - static이 붙지 않은 메서드
 * - 인스턴스가 있어야만 인스턴스 메서드를 사용할 수 있다.
 * - 내부의 this라는 히든 파라미터가 인스턴스 주소를 받는다.
 */
public class Calculator {
  //default : 같은 패키지의 클래스만이 접근 가능하다.
  //protected: default + 서브 클래스는 접근 가능
  protected int result; //인스턴스 변수는 0으로 자동 초기화 된다.
  
  public void init(/*Calculator this,*/ int a) {
    this.result = a;
  }
  
  public void plus(/*Calculator this,*/ int a) {
    this.result += a;
  }
  
  public void minus(/*Calculator this,*/ int a) {
    this.result -= a;
  }
  
  public void multiple(/*Calculator this,*/ int a) {
    this.result *= a;
  }
}











