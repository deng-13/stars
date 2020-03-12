package com.star.conc.basic.chapter1.scene1_1_6;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *
 * getQueueLength 取得等待许可的线程个数
 * hasQueuedThreads 判断又没有线程在等下这个线程
 *
 * 判断当前有没有 等待许可的线程信息使用
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

      Thread.sleep(500);
      System.out.println(" 还有大约" + semaphore.getQueueLength() + "个线程在等待");
      System.out.println("是否有线程正在等待信号量" + semaphore.hasQueuedThreads());

      semaphore.release();
    } catch (Exception e) {

    }
  }

}
