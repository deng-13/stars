package com.star.conc.basic.chapter8.scene_8_10;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  private String username;

  public MyRunnable(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public void run() {

    try {

      while (true) {
        if (Thread.currentThread().isInterrupted() == true) {
          throw new InterruptedException();
        }

        System.out.println("run--- username= " + username + " " + Thread.currentThread().getName());
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("run--- username= " + username + " " + Thread.currentThread().getName());
  }
}
