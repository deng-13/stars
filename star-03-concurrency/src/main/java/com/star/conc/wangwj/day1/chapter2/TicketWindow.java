package com.star.conc.wangwj.day1.chapter2;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import sun.awt.windows.ThemeReader;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class TicketWindow extends Thread {

  private final String name;

  //private final int MAX = 50;
  //添加 static ，让变量初始化一次
  private final static int MAX = 50;

  //添加 static ，让变量初始化一次
  private static int index = 1;

  public TicketWindow(String name) {
    this.name = name;
  }

  @Override
  public void run() {

    while (index <= MAX){
      System.out.println(name + ":当前号码是" + (index++));
    }
  }
}
