package com.kdn.bitedu.test.test15;

import java.io.FileInputStream;

public class TestRead {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("test01.dat");
    int temp = 0;
    while((temp = in.read()) != -1) {
      System.out.println(Integer.toHexString(temp));
    }
  }

}
