package com.kdn.bitedu.test.test13;

/* 인터페이스 구현
 * class 클래스명 implements 인터페이스명, 인터페이스명, ... {}
 * - 인터페이스를 구현하는 클래스는 반드시 인터페이스의 모든 메서드를 구현해야 한다.
 */
public class BZEngine extends BaseEngine implements Engine  {
  @Override
  public void start() {
    System.out.println("가솔린 엔진 가동.");
    System.out.println("연료효율 극대화");
  }
}
