package com.kdn.bitedu.test.test13;

// 직접 사용되지 못하게 막고 싶으면,
// 단지 서브 클래스에 공통 변수와 메서드를 상속해주고 싶으면,
// ==> 추상 클래스로 선언하라!

abstract public class BaseEngine {
  protected int valve;
  protected String type;
  
  public int getValve() {
    return valve;
  }
  public void setValve(int valve) {
    this.valve = valve;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  
}
