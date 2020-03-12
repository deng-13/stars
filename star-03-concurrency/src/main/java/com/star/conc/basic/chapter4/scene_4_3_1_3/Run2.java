package com.star.conc.basic.chapter4.scene_4_3_1_3;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run2 {

  /**
   * 条件：在线程池中添加的线程数量 > corePoolSize 且 <= maximumPoolSize
   *      队列使用 SynchronousQueue
   * 结论：线程数量 > corePoolSize 时将多余的任务放到队列中执行 总数量为 8 ，并且线程总数量也没有超多 maximumPoolSize = 9
   *      由于 运行的线程数量=8 ，超多了 corePoolSize=7 -> keepAliveTime > 5 时清除空余线程
   *      如果使用 SynchronousQueue ，则maximumPoolSize 参数起作用
   *
   **/
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
        new SynchronousQueue<>());

    // 创建8个线程 > corePoolSize 且 < maximumPoolSize
    threadPoolExecutor.execute(runnable); //1
    threadPoolExecutor.execute(runnable); //2
    threadPoolExecutor.execute(runnable); //3
    threadPoolExecutor.execute(runnable); //4
    threadPoolExecutor.execute(runnable); //5
    threadPoolExecutor.execute(runnable); //6
    threadPoolExecutor.execute(runnable); //7
    threadPoolExecutor.execute(runnable); //8
//    threadPoolExecutor.execute(runnable); //9
//    threadPoolExecutor.execute(runnable); //10

    Thread.sleep(300);

    System.out.println("A " + threadPoolExecutor.getCorePoolSize());
    System.out.println("A " + threadPoolExecutor.getPoolSize());
    System.out.println("A " + threadPoolExecutor.getQueue().size());


    System.out.println("");

    Thread.sleep(7000);
    System.out.println("B " + threadPoolExecutor.getCorePoolSize());
    System.out.println("B " + threadPoolExecutor.getPoolSize());
    System.out.println("B " + threadPoolExecutor.getQueue().size());
  }

}
