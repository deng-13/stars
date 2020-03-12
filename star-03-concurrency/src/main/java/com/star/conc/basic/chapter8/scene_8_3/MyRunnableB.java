package com.star.conc.basic.chapter8.scene_8_3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class MyRunnableB implements Runnable {

  @Override
  public void run() {

    System.out.println("MyRunnableB begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
    System.out.println("MyRunnableB end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

  }
}
