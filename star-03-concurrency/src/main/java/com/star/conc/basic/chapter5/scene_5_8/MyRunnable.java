package com.star.conc.basic.chapter5.scene_5_8;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyRunnable implements Runnable {

  private String name;

  public MyRunnable(String name) {
    this.name = name;
  }

  @Override
  public void run() {

    System.out.println(name + " 正在运行。。。");
  }
}
