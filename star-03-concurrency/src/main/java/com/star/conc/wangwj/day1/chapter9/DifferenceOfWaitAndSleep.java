package com.star.conc.wangwj.day1.chapter9;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class DifferenceOfWaitAndSleep {

  private static Object lock = new Object();

  public static void main(String[] args) {
    m1();
  }

  public static void m1(){

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void m2(){

    synchronized (lock) {
      try {
        lock.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}
