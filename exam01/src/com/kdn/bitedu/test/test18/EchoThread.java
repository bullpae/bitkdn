package com.kdn.bitedu.test.test18;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoThread extends Thread {
  String threadName;
  Socket socket;
  
  public EchoThread(Socket s, String name) {
    this.socket = s;
    this.threadName = name;
    System.out.println(name + "을 생성하였음.");
  }
  
  @Override
  public void run() {
    try {
      PrintStream out = new PrintStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());
      
      String str = in.nextLine();
      System.out.println(threadName + ":클라이언트로부터 데이터를 받았음.");
      System.out.println(threadName + ":" + str);
      
      out.println(threadName + ":" + str);
      System.out.println(threadName + ":클라이언트에게 데이터를 보냈음.");
      
      out.close();
      in.close();
      socket.close();
      
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

}
