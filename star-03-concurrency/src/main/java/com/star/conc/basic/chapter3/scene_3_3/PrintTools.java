package com.star.conc.basic.chapter3.scene_3_3;

import java.util.concurrent.Phaser;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-01
 * @author： xingxingzhao
 */
public class PrintTools {

  public static Phaser phaser;


  public static void method(){

    System.out.println(Thread.currentThread().getName() + " 赛程A begin " + System.currentTimeMillis());
    phaser.arriveAndAwaitAdvance();
    System.out.println(Thread.currentThread().getName() + " 赛程A end " + System.currentTimeMillis());

    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + " 赛程B begin " + System.currentTimeMillis());
    phaser.arriveAndAwaitAdvance();
    System.out.println(Thread.currentThread().getName() + " 赛程B end " + System.currentTimeMillis());


  }

  /**
   * 重新定义一个新的方法，让运动员C 调用，从而缺席 赛程B 的赛事，进一步是 整个赛事处于 阻塞的状态
   */
  public static void methodC(){

    System.out.println(Thread.currentThread().getName() + " 赛程A begin " + System.currentTimeMillis());
    phaser.arriveAndAwaitAdvance();
    System.out.println(Thread.currentThread().getName() + " 赛程A end " + System.currentTimeMillis());

  }

}
