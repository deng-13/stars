package com.star.conc.basic.chapter2.scene2_1_1;

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

    MyCountDownLatch countDownLatch = new MyCountDownLatch();

    MyThread thread = new MyThread(countDownLatch);

    thread.start();
    countDownLatch.downMethod();
  }
}
