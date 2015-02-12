package com.kdn.bitedu.test.test13;

/* 인터페이스
 * - 호출자와 호출 당하는 자 사이의 규칙
 * - 호출 규칙
 * - 대체 가능성을 높인다.
 */
public interface Engine {
  // 인터페이스의 모든 메서드는 규칙을 의미하기 때문에
  // 구현해서는 안된다. => 모두 추상 메서드이어야 한다.
  // 규칙은 공개되어야 하기 때문에 => 모든 메서드는 public 이다.
  // public abstract는 생략할 수 있다.
  /*public abstract*/ void start();
}







