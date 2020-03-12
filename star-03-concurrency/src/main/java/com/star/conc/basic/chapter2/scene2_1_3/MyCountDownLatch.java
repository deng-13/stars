package com.star.conc.basic.chapter2.scene2_1_3;

import java.util.concurrent.CountDownLatch;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MyCountDownLatch {

  private CountDownLatch downLatch = new CountDownLatch(1);


  public void testMethod()  {

    try {
      System.out.println(Thread.currentThread().getName() + "准备");

      // 执行时，代码呈等待状态，程序不继续执行
      downLatch.await();
      System.out.println(Thread.currentThread().getName() + "结束");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void downMethod(){

    //执行时，计数由1变成0，以前呈 等待状态的线程继续往下运行
    downLatch.countDown();
    System.out.println("开始");

  }

}
