package com.star.conc.basic.chapter1.scene1_1_5;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *
 * availablePermits 返回当前可用的许可数
 * drainPermits 返回立即可用的所有许可数，并且将可用许可数设置为 0
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MySemaphore {

  // 定义最多允许N个线程执行 acquire ， release 之间的代码，结果会是同步执行的
  private Semaphore semaphore = new Semaphore(5);

  public void testMethod() {

    try {
      semaphore.acquire();

      System.out.println(semaphore.availablePermits());
      System.out.println(semaphore.drainPermits() + " -- " + semaphore.availablePermits());
      System.out.println(semaphore.drainPermits() + " -- " +  semaphore.availablePermits());

      semaphore.release();
    } catch (Exception e) {

    }
  }

}
