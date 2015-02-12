package com.kdn.bitedu.test.test17;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);
    
    OutputStream out = socket.getOutputStream();
    InputStream in = socket.getInputStream();
    
    PrintStream out2 = new PrintStream(out);
    Scanner in2 = new Scanner(in);
    
    //키보드로부터 입력 받아 서버에 보내기
    Scanner keyboard = new Scanner(System.in);
    String message = keyboard.nextLine();
    keyboard.close();
    
    out2.println(message);  
    String str = in2.nextLine();
    
    System.out.println(str);
    
    out2.close();
    in2.close();
    out.close();
    in.close();
    socket.close();

  }

}
