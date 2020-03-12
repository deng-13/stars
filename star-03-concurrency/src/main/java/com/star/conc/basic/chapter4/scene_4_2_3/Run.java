package com.star.conc.basic.chapter4.scene_4_2_3;

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

    ExecutorService executorService = Executors.newCachedThreadPool(myThreadFactory);

    executorService.execute(new Runnable() {
      @Override
      public void run() {

        System.out.println("我在运行 " + Thread.currentThread().getName());
      }
    });
  }
}
