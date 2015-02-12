package com.kdn.bitedu.test.test16;

import java.io.FileWriter;

/* 문자 데이터 출력
 * - Writer 계열의 클래스를 사용해야 한다.
 * - FileWriter 사용
 * - Unicode 2byte를 출력할 때 시스템 문자 코드로 자동 변환하여 출력한다.
 * - 텍스트 파일을 읽어 들일 때 자바 Unicode 2byte로 자동 변환한다.
 * 
 * 정리
 * - 자바에서는 바이너리 데이터와 문자 데이터 입출력 클래스를 제공한다.
 * - 문자 입출력: XxxxReader/XxxxxWriter
 *   => 입출력할 때 자동 변환된다.
 *     출력할 때, 시스템 문자 코드로 변환됨 : 유니코드 => 시스템 기본 문자코드
 *     읽을 때, 시스템 문자 코드 => 자바 유니코드(2) 
 * - 바이너리 입출력: XxxxInputStream/XxxxOutputStream
 *   => 바이트 단위로 그대로 입출력한다. 변환 같은 것은 없다.
 */
public class TestWrite {

  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("test02.dat");
    out.write('A');
    out.write('B');
    out.write('C');
    out.write('a');
    out.write('b');
    out.write('c');
    out.write('1');
    out.write('2');
    out.write('3');
    out.write('가');
    out.write('각');
    out.write('간');
    out.close();
  }
  
  public static void main01(String[] args) throws Exception {
    char c = 0x0041;
    char c2 = 0x41;
    char c3 = 0xAC00;
    char c4 = '똘';
    
    System.out.println(c);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
  }

}













