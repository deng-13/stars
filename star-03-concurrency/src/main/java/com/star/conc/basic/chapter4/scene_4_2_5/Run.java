package com.star.conc.basic.chapter4.scene_4_2_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {
    MyThreadFactory myThreadFactory = new MyThreadFactory();

    ExecutorService executorService = Executors.newFixedThreadPool(2, myThreadFactory);

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("我在运行 begin " + Thread.currentThread().getName());

        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("我在运行 end" + Thread.currentThread().getName());


      }
    };


    executorService.execute(runnable);
    executorService.execute(runnable);
    executorService.execute(runnable);
  }
}
