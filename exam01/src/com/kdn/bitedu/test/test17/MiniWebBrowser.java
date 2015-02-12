package com.kdn.bitedu.test.test17;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MiniWebBrowser {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("www.kdn.com", 80);
    
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    out.println("GET / HTTP/1.1");
    out.println("Host: www.kdn.com");
    out.println();
    
    try {
      String str = null;
      while(true) {
        str = in.nextLine();
        System.out.println(str);
      }
    } catch(Exception e) {
      //e.printStackTrace();
    }
    
    
    out.close();
    in.close();
    socket.close();

  }

}
