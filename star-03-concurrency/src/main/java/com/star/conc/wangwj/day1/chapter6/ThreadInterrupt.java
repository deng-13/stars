package com.star.conc.wangwj.day1.chapter6;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class ThreadInterrupt {

  public static void main(String[] args) throws InterruptedException {

    Thread thread  = new Thread() {

      @Override
      public void run() {
//        while ( true) {
//          System.out.println("while is " + this.isInterrupted());
//        }
        while ( true) {
          try {
            this.sleep(1000);
          } catch (InterruptedException e) {
            System.out.println("while is " + this.isInterrupted());
            e.printStackTrace();
          }
        }
      }
    };

    thread.start();
    Thread.sleep(1000);;

    System.out.println(Thread.currentThread().isInterrupted());

    thread.interrupt();

    System.out.println(Thread.currentThread().isInterrupted());
  }
}
