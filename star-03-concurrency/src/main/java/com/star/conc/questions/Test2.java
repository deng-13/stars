package com.star.conc.questions;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-09
 * @author： xingxingzhao
 */
public class Test2 {

  /**
   * 设计四个线程
   * 其中两个线程每次对变量i加1,另外两个线程每次对i减1
   *
   * @author Soinice
   * @date 2019/5/30 18:17
   */
    public static void main(String[] args) throws InterruptedException {
      final ThreadMethod threadMethod = new ThreadMethod();

      for (int i = 0 ; i < 2 ; i++){
        Thread thread = new Thread(new Runnable() {
          @Override
          public void run() {
            threadMethod.add();
          }
        });
        thread.start();
        thread.join();
      }

      for (int i = 0 ; i < 2 ; i++){
        Thread thread = new Thread(new Runnable() {
          @Override
          public void run() {
            threadMethod.sub();
          }
        });
        thread.start();
        thread.join();
      }

    }

    static class ThreadMethod {

      private AtomicInteger atomicInteger = new AtomicInteger();

      public void add() {

        System.out.println(Thread.currentThread().getName() + " ---- add():i = " + atomicInteger.incrementAndGet());
      }

      public void sub() {
        System.out.println(Thread.currentThread().getName() + " ---- sub():i = " + atomicInteger.decrementAndGet());
      }
    }
}
