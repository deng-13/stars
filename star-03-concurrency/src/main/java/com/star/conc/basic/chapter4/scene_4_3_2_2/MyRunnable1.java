package com.star.conc.basic.chapter4.scene_4_3_2_2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyRunnable1 implements Runnable {

  @Override
  public void run() {

      for (int i = 0 ; i < Integer.MAX_VALUE / 1000 ; i++){

        Math.random();
        Math.random();
        Math.random();
        Math.random();
        Math.random();
        Math.random();
        Math.random();
      }
      System.out.println("任务完成了");

  }
}
