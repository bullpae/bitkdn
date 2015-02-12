package com.kdn.bitedu.test.test11;

public class GMEngine extends Engine {
  //엔진에 전기 구동 모터 추가 
  @Override
  public void start() {
    super.start();
    System.out.println("전기 모터용 밧데리를 충전한다.");
  }
}
