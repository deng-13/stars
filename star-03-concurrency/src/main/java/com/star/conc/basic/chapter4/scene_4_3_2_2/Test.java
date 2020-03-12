package com.star.conc.basic.chapter4.scene_4_3_2_2;

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
public class Test {

  public static void main(String[] args) {

    MyRunnable myRunnable = new MyRunnable();

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4, 5L, TimeUnit.SECONDS,
        new LinkedBlockingQueue<Runnable>());
    poolExecutor.execute(myRunnable);
    poolExecutor.execute(myRunnable);
    poolExecutor.execute(myRunnable);
    poolExecutor.execute(myRunnable);

    poolExecutor.shutdownNow();

    System.out.println("main end");
  }
}
