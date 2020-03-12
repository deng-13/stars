package com.star.conc.basic.chapter8.scene_8_7;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
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

  public static void main(String[] args) throws InterruptedException {

    ScheduledThreadPoolExecutor executorService = new ScheduledThreadPoolExecutor(1);

    Runnable runnable1 = new MyRunnable("A");
    Runnable runnable2 = new MyRunnable("B");

    ScheduledFuture future1 = executorService.scheduleAtFixedRate(runnable1, 0, 2, TimeUnit.SECONDS);
    Thread.sleep(1000);

    ScheduledFuture future2 = executorService.scheduleAtFixedRate(runnable2, 0, 2, TimeUnit.SECONDS);
    Thread.sleep(5000);

    System.out.println(executorService.remove((Runnable) future2));
    System.out.println(" ");

    BlockingQueue<Runnable> queue = executorService.getQueue();
    Iterator<Runnable> iterator = queue.iterator();
    while (iterator.hasNext()) {
      Runnable runnable = iterator.next();
      System.out.println(" 队列中的 ： " + runnable);
    }

  }
}
