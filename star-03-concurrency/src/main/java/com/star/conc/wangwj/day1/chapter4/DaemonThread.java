package com.star.conc.wangwj.day1.chapter4;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class DaemonThread {

  public static void main(String[] args) throws InterruptedException {

    Thread thread = new Thread("myDaemonThread") {

      public void run() {

        try {

          System.out.println(Thread.currentThread().getName() + " run");
          Thread.sleep(10000);
          System.out.println(Thread.currentThread().getName() + " dead");
        } catch (Exception e){

        }
      }
    };

    thread.setDaemon(true);
    thread.start();
    Thread.sleep(10_000);
    System.out.println(Thread.currentThread().getName());
  }

}
