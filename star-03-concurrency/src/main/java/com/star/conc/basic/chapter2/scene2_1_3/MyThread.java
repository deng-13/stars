package com.star.conc.basic.chapter2.scene2_1_3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MyThread extends Thread {

  private MyCountDownLatch myCountDownLatch;

  public MyThread(MyCountDownLatch myCountDownLatch) {
    this.myCountDownLatch = myCountDownLatch;
  }

  @Override
  public void run() {

    myCountDownLatch.testMethod();
  }
}
