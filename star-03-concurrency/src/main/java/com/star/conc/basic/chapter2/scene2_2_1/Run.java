package com.star.conc.basic.chapter2.scene2_2_1;

import java.util.concurrent.CyclicBarrier;

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

    // 设置了最大为2个的 parties 的同行者，只有5个线程都执行了 cyclicBarrier.await() 方法程序才能继续向下执行
    CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
      @Override
      public void run() {
        System.out.println("全来了");
      }
    });

    for (int i = 0 ; i < 4 ; i++){

      MyThread thread = new MyThread(cyclicBarrier);
      thread.start();
      Thread.sleep(2000);
    }
  }
}
