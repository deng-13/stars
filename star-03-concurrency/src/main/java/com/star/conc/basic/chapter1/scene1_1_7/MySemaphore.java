package com.star.conc.basic.chapter1.scene1_1_7;

import java.util.concurrent.Semaphore;

/**
 * <p>
 *
 * 判断当前有没有 等待许可的线程信息使用
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MySemaphore {

  private boolean isFair = true;
  // 定义最多允许N个线程执行 acquire ， release 之间的代码，结果会是同步执行的
  private Semaphore semaphore = new Semaphore(1 , isFair);

  public void testMethod() {

    try {
      semaphore.acquire();

      System.out.println(Thread.currentThread().getName());

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      semaphore.release();
    }
  }

}
