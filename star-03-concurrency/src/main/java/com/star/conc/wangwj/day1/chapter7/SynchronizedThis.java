package com.star.conc.wangwj.day1.chapter7;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class SynchronizedThis {

  public static void main(String[] args) throws InterruptedException {

    ThisLock thisLock = new ThisLock();

    new Thread("T1"){

      @Override
      public void run() {
        try {
          thisLock.method1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }.start();


    new Thread("T2"){

      @Override
      public void run() {
        try {
          thisLock.method2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }.start();
  }

}

class ThisLock{

  public synchronized void method1() throws InterruptedException {

    Thread.sleep(10000);
    System.out.println(Thread.currentThread().getName());
  }

  public synchronized void method2() throws InterruptedException {

    Thread.sleep(10000);

    System.out.println(Thread.currentThread().getName());
  }
}