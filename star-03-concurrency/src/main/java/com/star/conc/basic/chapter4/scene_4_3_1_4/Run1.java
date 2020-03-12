package com.star.conc.basic.chapter4.scene_4_3_1_4;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run1 {

  /**
   * 条件：在线程池中添加的线程数量 > maximumPoolSize
   *      队列使用 LinkedBlockingDeque
   * 结论：线程数量 > maximumPoolSize 时将其余的任务放入队列中
   *      同一时间 最多只有7个线程运行 -> keepAliveTime > 5 时，也不清除空闲线程
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
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, 9, 5, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    // 创建10个线程 > maximumPoolSize
    threadPoolExecutor.execute(runnable); //1
    threadPoolExecutor.execute(runnable); //2
    threadPoolExecutor.execute(runnable); //3
    threadPoolExecutor.execute(runnable); //4
    threadPoolExecutor.execute(runnable); //5
    threadPoolExecutor.execute(runnable); //6
    threadPoolExecutor.execute(runnable); //7
    threadPoolExecutor.execute(runnable); //8
    threadPoolExecutor.execute(runnable); //9
    threadPoolExecutor.execute(runnable); //10

    Thread.sleep(400);
    System.out.println("A " + threadPoolExecutor.getCorePoolSize());
    System.out.println("A " + threadPoolExecutor.getPoolSize());
    System.out.println("A " + threadPoolExecutor.getQueue().size());

    Thread.sleep(2000);
    System.out.println("B " + threadPoolExecutor.getCorePoolSize());
    System.out.println("B " + threadPoolExecutor.getPoolSize());
    System.out.println("B " + threadPoolExecutor.getQueue().size());
  }

}
