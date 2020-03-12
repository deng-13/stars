package com.star.conc.basic.chapter4.scene_4_3_1_2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 条件：在线程池中添加的线程数量 <= corePoolSize
 *      队列使用 LinkedBlockingDeque
 * 结论：马山创建线程执行这个任务，并不放在扩展队列中
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run1 {

  /**
   * 条件：在线程池中添加的线程数量 <= corePoolSize
   *      队列使用 LinkedBlockingDeque
   * 结论：马山创建线程执行这个任务，并不放在扩展队列中
   */
  public static void main(String[] args) throws InterruptedException {

    Runnable runnable = new Runnable() {
      @Override
      public void run() {

        System.out.println(Thread.currentThread().getName() + " run "+ System.currentTimeMillis());
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<>());

    // 创建2个线程 = corePoolSize
    threadPoolExecutor.execute(runnable);
    threadPoolExecutor.execute(runnable);

    Thread.sleep(4000);
    System.out.println("A " + threadPoolExecutor.getCorePoolSize());
    System.out.println("A " + threadPoolExecutor.getPoolSize());
    System.out.println("A " + threadPoolExecutor.getQueue().size());

    Thread.sleep(4000);
    System.out.println("B " + threadPoolExecutor.getCorePoolSize());
    System.out.println("B " + threadPoolExecutor.getPoolSize());
    System.out.println("B " + threadPoolExecutor.getQueue().size());
  }

}
