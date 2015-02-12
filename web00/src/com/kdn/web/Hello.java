package com.kdn.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/* 서블릿 만들기
 * 1. javax.servlet.Servlet 인터페이스 구현
 * - 서블릿 객체는 단 한 개만 생성됨.
 * - init() : 서블릿을 최초로 생성될 때 호출됨.
 * - destroy() : 웹 애플리케이션이 멈추기 직전에 호출됨.
 * - service() : 클라이언트가 요청할 때마다 호출됨.
 * - getServletInfo(): 서버 관리자 페이지에서 호출함. 서블릿 설명 리턴.
 * - getServletConfig() : 각 서블릿의 설정 정보를 리턴함. 
 * 
 * 2. web.xml에 서블릿 정보 설정
 * - 웹 애플리케이션 관련 정보를 설정하는 파일 (Deployment Descriptor File; DDFile)
 * - 서블릿 정보 설정(서블릿 별명, 클래스 정보, ...)
 * - 서블릿에 URL을 부여(클라이언트는 URL을 요청한다.)
 */
public class Hello implements javax.servlet.Servlet {

  @Override
  public void destroy() {
    System.out.println("destroy()...");
    
  }

  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void init(ServletConfig arg0) throws ServletException {
    System.out.println("init()...");
    
  }

  @Override
  public void service(ServletRequest arg0, ServletResponse arg1)
      throws ServletException, IOException {
    System.out.println("service()...");
    
  }

}
