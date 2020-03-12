package com.star.conc.basic.chapter8.scene_8_9;

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

    System.out.println("run--- username= " + username + " " + Thread.currentThread().getName());
  }
}
