package com.star.conc.basic.chapter8.scene_8_5_1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  @Override
  public void run() {

    System.out.println( "     begin = " + System.currentTimeMillis()
    + " ThreadName = " + Thread.currentThread().getName());

    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println( "     end = " + System.currentTimeMillis()
        + " ThreadName = " + Thread.currentThread().getName());

  }
}
