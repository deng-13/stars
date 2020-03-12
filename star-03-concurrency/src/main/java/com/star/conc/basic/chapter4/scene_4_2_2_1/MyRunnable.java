package com.star.conc.basic.chapter4.scene_4_2_2_1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  private String userName;

  public MyRunnable(String userName) {
    this.userName = userName;
  }

  @Override
  public void run() {

    System.out.println(Thread.currentThread().getName() + " userName= " + userName + " begin");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + " userName= " + userName + " end");

  }
}
