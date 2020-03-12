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
public class MyThread extends Thread{

  private CountDownLatch maxRunner;

  public MyThread(CountDownLatch maxRunner) {
    this.maxRunner = maxRunner;
  }

  @Override
  public void run() {

    try {
      System.out.println(Thread.currentThread().getName());
      maxRunner.countDown();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
