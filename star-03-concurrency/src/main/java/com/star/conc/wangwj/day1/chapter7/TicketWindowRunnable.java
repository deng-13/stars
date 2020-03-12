package com.star.conc.wangwj.day1.chapter7;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class TicketWindowRunnable implements Runnable {

  //添加 static ，让变量初始化一次
  private final static int MAX = 50;

  private int index = 1;

  private Object monitor = new Object();

  @Override
  public void run() {

    synchronized (monitor) {
      while (index <= MAX) {
        System.out.println(Thread.currentThread().getName() + ":当前号码是" + (index));
      }
    }
  }

}
