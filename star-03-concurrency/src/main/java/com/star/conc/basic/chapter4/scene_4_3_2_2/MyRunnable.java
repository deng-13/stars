package com.star.conc.basic.chapter4.scene_4_3_2_2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  @Override
  public void run() {

    try {

      for (int i = 0 ; i < Integer.MAX_VALUE / 50 ; i++){

        if (Thread.currentThread().isInterrupted() == true){

          System.out.println("任务没有完成，就中断了");

          throw new InterruptedException();
        }
      }
      System.out.println("任务完成了");

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
