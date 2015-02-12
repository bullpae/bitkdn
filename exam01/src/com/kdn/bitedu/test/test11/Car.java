package com.kdn.bitedu.test.test11;

/* 생성자
 * - 인스턴스가 생성된 후 자동으로 호출되는 아주 특별한 메서드
 * - 메서드 이름이 클래스 이름과 같아야한다.
 * - 메서드의 리턴 값이 없다.
 * - 용도: 필수 항목을 초기화.
 */
public class Car {
  Engine engine;
  Tire[] tires;
  AirCond aircond;
  
  public Car() {
    // 로컬에 해당 변수가 없고 인스턴스 변수라면 this가 자동으로 붙는다.
    /*this.*/engine = new Engine();
  }
  
  public Car(Engine other) {
    engine = other;
  }
  
  public void run() {
    engine.start();
    System.out.println("달린다.");
  }
  
}
