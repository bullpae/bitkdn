package com.kdn.bitedu.test.test12;

/* 추상 클래스
 * - 서브 클래스에게 공통 변수나 메서드를 상속해주는 용도
 * - 직접 인스턴스를 생성해서 사용할 수 없다.
 * 
 * 상속
 * 1) Specialization (특화시킴)
 * 2) Generalization (일반화시킴) ***
 *    => 서브 클래스들의 공통 변수나 메서드가 발견되면
 *       수퍼 클래스를 정의하여 옮긴다. 그래서 상속 관계를 맺는다.
 */
abstract public class Engine {
  protected int valve;
  protected String type;
  
  
  /* 추상 메서드
   * - 메서드의 규칙만 정의하고,
   *   구체적인 구현은 서브 클래스에게 맡긴다.
   * - 추상 클래스 만이 추상 메서드를 가질 수 있다.
   * - 서브 클래스 개발자에게 구현을 강제한다.
   */
  abstract public void start();
  
  // setter 메서드
  public void setValve(int v) {
    this.valve = v;
  }
  
  // getter 메서드
  public int getValve() {
    return this.valve;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  
}











