package com.kdn.bitedu.test.test17;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행!");
    
    while(true) {
      Socket socket = ss.accept(); // 대기열에서 클라이언트 연결 정보를 꺼낸다.
      System.out.println("클라이언트와 연결됨.");
      
      PrintStream out = new PrintStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      
      String str = in.nextLine();
      System.out.println("클라이언트로부터 데이터를 받았음.");
      System.out.println("==>" + str);
      
      out.println("^^:" + str);
      System.out.println("클라이언트에게 데이터를 보냈음.");
      
      out.close();
      in.close();
      socket.close();
    }
    //ss.close();
    //System.out.println("서버 종료!");
  }
}













