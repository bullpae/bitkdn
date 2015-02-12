package com.kdn.bitedu.test.test18;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행!");
    int count = 0;
    
    while(true) {
      Socket socket = ss.accept(); // 대기열에서 클라이언트 연결 정보를 꺼낸다.
      System.out.println("클라이언트와 연결됨.");
      try {
        EchoThread thread = new EchoThread(socket, "스레드" + count);
        count++;
        thread.start();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    //ss.close();
    //System.out.println("서버 종료!");
  }
}













