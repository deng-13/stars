package com.star.conc.basic.chapter4.scene_4_3_2_1;

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

    System.out.println(Thread.currentThread().getName() + " begin "+ System.currentTimeMillis());

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + " end "+ System.currentTimeMillis());

  }
}
