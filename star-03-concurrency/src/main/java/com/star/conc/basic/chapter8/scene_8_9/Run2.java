package com.star.conc.basic.chapter8.scene_8_9;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class Run2 {

  public static void main(String[] args) {

    ScheduledThreadPoolExecutor executorService = new ScheduledThreadPoolExecutor(10);

    Runnable runnable1 = new MyRunnable("A");

    executorService.scheduleAtFixedRate(runnable1, 1, 2, TimeUnit.SECONDS);
    executorService.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
    executorService.shutdown();
    System.out.println(" 执行了 shutdown");

  }
}
