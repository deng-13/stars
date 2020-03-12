package com.star.conc.basic.chapter8.scene_8_3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class MyRunnableA implements Runnable {

  @Override
  public void run() {

    System.out.println("MyRunnableA begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MyRunnableA end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

  }
}
