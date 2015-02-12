package com.kdn.bitedu.test.test16;

import java.io.FileReader;

public class TestRead {

  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("test02.dat");
    int temp = 0;
    while((temp = in.read()) != -1) {
      System.out.println(Integer.toHexString(temp));
    }
  }

}
