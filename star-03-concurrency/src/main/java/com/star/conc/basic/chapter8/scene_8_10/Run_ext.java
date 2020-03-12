package com.star.conc.basic.chapter8.scene_8_10;

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
public class Run_ext {

  public static void main(String[] args) throws InterruptedException {

    ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(10);

    Runnable runnable1 = new MyRunnable("A");

    ScheduledFuture future = threadPoolExecutor.schedule(runnable1, 0, TimeUnit.SECONDS);
    Thread.sleep(2000);

    BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
    System.out.println("A处size() " + queue.size());

    System.out.println(future.cancel(true));

    queue = threadPoolExecutor.getQueue();

    System.out.println("B处size() " + queue.size());

  }
}
