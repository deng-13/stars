package com.star.conc.basic.chapter8.scene_8_10;

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

  public static void main(String[] args) {

    ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(10);

    Runnable runnable1 = new MyRunnable("A");

    ScheduledFuture future = threadPoolExecutor.schedule(runnable1 , 1, TimeUnit.SECONDS);
    threadPoolExecutor.setRemoveOnCancelPolicy(true);
    System.out.println(future.cancel(true));

    System.out.println(" ");

    BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
    Iterator<Runnable> iterator = queue.iterator();
    while (iterator.hasNext()) {
      Runnable runnable = iterator.next();
      System.out.println(" 队列中的 ： " + runnable);
    }
  }
}
