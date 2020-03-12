package com.star.conc.basic.chapter1.scene1_1_1;

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

  public void testMethod(){

    try {
      semaphore.acquire();

      System.out.println(Thread.currentThread().getName() + " begin timer " + System.currentTimeMillis());
      Thread.sleep(500);
      System.out.println(Thread.currentThread().getName() + " end timer " + System.currentTimeMillis());

      semaphore.release();
    } catch (Exception e){

    }
  }

}
