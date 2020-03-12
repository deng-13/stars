package com.star.conc.wangwj.day1.chapter7;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class SynchronizedStatic {

  static {

    synchronized (SynchronizedStatic.class) {

      try {
        System.out.println(Thread.currentThread().getName());

        Thread.sleep(20000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {

    new Thread("T1") {

      @Override
      public void run() {
        try {
          method1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }.start();

    new Thread("T2") {

      @Override
      public void run() {
        try {
          method2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }.start();
  }

  public static void method1() throws InterruptedException {

    Thread.sleep(10000);
    System.out.println(Thread.currentThread().getName());
  }

  public static void method2() throws InterruptedException {

    Thread.sleep(10000);

    System.out.println(Thread.currentThread().getName());
  }
}
