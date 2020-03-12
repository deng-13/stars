package com.star.conc.basic.chapter3.scene_3_2;

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
    //当前线程达到屏障，在此等待一段时间，等条件满足后继续向下一个屏障 继续进行
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

}
