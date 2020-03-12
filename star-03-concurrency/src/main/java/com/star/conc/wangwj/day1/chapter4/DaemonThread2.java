package com.star.conc.wangwj.day1.chapter4;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class DaemonThread2 {

  public static void main(String[] args) {

    Thread mainThread = new Thread(() ->{
      // mainThread 线程结束， innerThread 子线程作为守护线程 将会自动结束
      // 否则，将 innerThread 将会持续执行，不会随着 主线程的dead 的结束而结束
      Thread innerThread = new Thread(() -> {

        while ( true) {
          System.out.println(" running for health check.");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      });

      innerThread.setDaemon(true);
      innerThread.start();

    });

    System.out.println(Thread.currentThread().getName());
    mainThread.start();
  }
}
