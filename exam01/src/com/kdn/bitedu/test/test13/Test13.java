package com.kdn.bitedu.test.test13;

public class Test13 {

  public static void main(String[] args) {
    BZEngine engine = new BZEngine();
    GMEngine engine2 = new GMEngine();
    Car car = new Car(engine2);
    
    car.run();

  }

}
