package com.kdn.bitedu.test.test17;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);
    
    OutputStream out = socket.getOutputStream();
    InputStream in = socket.getInputStream();
    
    PrintStream out2 = new PrintStream(out);
    Scanner in2 = new Scanner(in);
    
    // 데이터 통신은 기본으로 블록킹 방식이다. : 데이터를 완전히 보내거나 완전히 받을 때만 리턴한다.
    out2.println("Hello!");  
    String str = in2.nextLine();
    
    System.out.println(str);
    
    out2.close();
    in2.close();
    out.close();
    in.close();
    socket.close();

  }

}
