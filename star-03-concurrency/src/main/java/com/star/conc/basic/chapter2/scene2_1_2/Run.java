package com.star.conc.basic.chapter2.scene2_1_2;

import java.util.concurrent.CountDownLatch;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) throws InterruptedException {

    CountDownLatch maxRunner = new CountDownLatch(10);
    MyThread[] threads = new MyThread[Integer.parseInt(maxRunner.getCount() + "")];
    for (int i =0 ; i < threads.length ; i++){
      threads[i] = new MyThread(maxRunner);
      threads[i].setName("线程" + i);
      threads[i].start();
    }

    maxRunner.await();
    System.out.println("都回来了");

  }
}
