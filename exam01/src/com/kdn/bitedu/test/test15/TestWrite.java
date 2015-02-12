package com.kdn.bitedu.test.test15;

import java.io.FileOutputStream;

/* 자바 입출력
 * - 바이트 입출력과 문자 입출력
 * - 읽기용과 쓰기용이 분리되어 있다.
 * - InputStream/OutputStream : 바이트 입출력 클래스
 * - Reader/Writer : 문자 입출력 클래스
 * 
 * 바이너리 파일?
 * - 일반 메모장으로 편집할 수 있으면 텍스트 파일이 된다.
 *   예) java, html, css, js, csv
 * - 전용 프로그램이 필요하다면 바이너리 파일이다.
 *   예) hwp, doc, xls, ppt, gif, mp3
 */
public class TestWrite {

  // 단순 바이트 출력
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("test01.dat");
    out.write(10);
    out.write(20);
    out.write(30);
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
    String str = new String("가각간");
    out.write(str.getBytes()); // UTF-8 코드 값을 리턴한다.
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













