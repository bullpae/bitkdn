package com.kdn.bitedu.test.test09;

import com.kdn.bitedu.test.test08.Calculator3;

/* 다형성: 
 * Overriding(재정의): 상속 받은 메서드를 현재의 클래스에 맞게 재정의 하는 것. 
 * Overloading(중복정의): 
 *   같은 기능을 하는 메서드에 대해 같은 이름을 부여함으로써 
 *   프로그래밍의 일관성을 제공하는 문법
 * Polymorphic variable(다형적 변수) 
*/
public class Calculator4 extends Calculator3 {
  public void plus(int a, int b) {
    result += a + b;
  }
  public void plus(float f) {
    result += f;
  }
  
  public void plus(double f) {
    result += f;
  }
}







