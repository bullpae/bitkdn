package com.kdn.bitedu.test.test07;

import com.kdn.bitedu.test.test06.Calculator;

/* 상속 문법
 * - 기존 코드를 확장
 * - 기존 코드를 손대지 않고 기능을 추가하는 방법
 * - 기존의 소스 코드를 알 필요가 없다.
 * 
 * 주의사항
 * - 서브 클래스가 수퍼 클래스의 메서드나 변수를 복제하는 것이 아니다.
 * - 단지 수퍼 클래스를 가리키는 링크 정보를 갖고 있다.
 * - 클래스를 배포할 때 수퍼 클래스도 함께 배포해야 한다.
 * - 항상 메서드를 호출할 때 계층 구조를 따라 올라가면서 메서드를 찾기 때문에
 *   C언어와 같은 절차적 언어보다는 호출 속도가 느리다.
 */
public class Calculator2 extends Calculator {
  public void divide(int a) {
    this.result /= a;
  }
  
  // 인스턴스의 값을 꺼내는 메서드
  // - get으로 시작한다.
  // - 겟터 메서드라 부름. getter
  public int getResult() {
    return this.result;
  }
}








