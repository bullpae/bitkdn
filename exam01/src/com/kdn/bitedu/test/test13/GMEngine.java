package com.kdn.bitedu.test.test13;

public class GMEngine extends HybridEngine implements Engine {
  @Override
  public void start() {
    System.out.println("연료로 움직일 때는 밧데리에 충전한다.");
    System.out.println("모터 돌아간다.");
  }
}
