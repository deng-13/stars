package com.star.conc.wangwj.day1.chapter7;

import com.star.conc.wangwj.day1.chapter2.TicketWindowRunnable;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class Bank2 {

  public static void main(String[] args) throws InterruptedException {

    final TicketWindowRunnable window = new TicketWindowRunnable();
    Thread t1 = new Thread(window, "window1");
    Thread t2 = new Thread(window, "window2");
    Thread t3 = new Thread(window, "window3");

    t1.start();
    t2.start();
    t3.start();


  }
}
