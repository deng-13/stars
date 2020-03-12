package com.star.conc.basic.chapter1.scene1_1_4;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MySemaphore {

  // 定义最多允许N个线程执行 acquire ， release 之间的代码，结果会是同步执行的
  private Semaphore semaphore = new Semaphore(1);

  public void testMethod() {

    try {
      semaphore.acquire();

      System.out
          .println(Thread.currentThread().getName() + " begin timer " + System.currentTimeMillis());
      for (int i =0 ; i < Integer.MAX_VALUE / 50; i++ ) {
        String string = new String();
        Math.random();
      }
      System.out
          .println(Thread.currentThread().getName() + " end timer " + System.currentTimeMillis());

      semaphore.release();
    } catch (InterruptedException e) {

      System.out.println("线程" + Thread.currentThread().getName() + "进入了 catch");
    }

    //// acquireUninterruptibly
//      semaphore.acquireUninterruptibly();
//
//      System.out
//          .println(Thread.currentThread().getName() + " begin timer " + System.currentTimeMillis());
//      for (int i =0 ; i < Integer.MAX_VALUE / 50; i++ ) {
//        String string = new String();
//        Math.random();
//      }
//      System.out
//          .println(Thread.currentThread().getName() + " end timer " + System.currentTimeMillis());
//
//      semaphore.release();
  }

}
