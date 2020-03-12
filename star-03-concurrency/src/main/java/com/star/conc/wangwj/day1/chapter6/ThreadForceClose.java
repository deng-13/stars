package com.star.conc.wangwj.day1.chapter6;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class ThreadForceClose {

  private Thread executeThread;

  private boolean finished = false;

  public void execute(Runnable task) {

    executeThread = new Thread() {

      @Override
      public void run() {

        Thread runner = new Thread(task);
        runner.setDaemon(true);
        runner.start();

        try {
          runner.join();
          finished = true;
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    };

    executeThread.start();
  }

  public void shutDown(long mills) {

    long startTime = System.currentTimeMillis();

    while (!finished) {

      if (System.currentTimeMillis() - startTime >= mills) {
        System.out.println("任务超时，需要结束。。。。");
        executeThread.interrupt();
        break;
      }

      try {
        executeThread.sleep(1);
      } catch (InterruptedException e) {
        System.out.println("执行被打断，任务结束。。。。");
        break;
      }
    }

    finished = false;

  }
}
