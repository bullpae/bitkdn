package com.kdn.bitedu.test.test12;

public class Test12 {

  public static void main(String[] args) {
    GMEngine engine = new GMEngine();
    BZEngine engine2 = new BZEngine();
    Car car = new Car(engine2);
    car.run();

  }
  
  public static void main01(String[] args) {
    // 기본 생성자가 없기 때문에 오류!
    // 기본 생성자란? 파라미터가 없는 생성자
    //Car car = new Car();
    //car.run();

  }

}
