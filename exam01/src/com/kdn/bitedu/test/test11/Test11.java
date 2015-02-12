package com.kdn.bitedu.test.test11;

public class Test11 {

  public static void main(String[] args) {
    GMEngine engine = new GMEngine();
    BZEngine engine2 = new BZEngine();
    Car car = new Car(engine2);
    car.run();

  }
  
  public static void main01(String[] args) {
    Car car = new Car();
    car.run();

  }

}
