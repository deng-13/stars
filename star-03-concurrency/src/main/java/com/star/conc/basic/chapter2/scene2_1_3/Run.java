package com.star.conc.basic.chapter2.scene2_1_3;

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
    MyThread[] threads = new MyThread[10];
    for (int i =0 ; i < threads.length ; i++){
      threads[i] = new MyThread(countDownLatch);
      threads[i].setName("线程" + i);
      threads[i].start();
    }

    Thread.sleep(2000);
    countDownLatch.downMethod();

  }
}
