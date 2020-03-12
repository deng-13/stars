package com.star.conc.basic.chapter4.scene_4_3_2_1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Test2 {

  public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4, 5L, TimeUnit.SECONDS,
        new LinkedBlockingQueue<Runnable>());
    poolExecutor.execute(myRunnable);
    System.out.println("main end");
  }
}
