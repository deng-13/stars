package com.star.conc.basic.chapter3.scene_3_4;

import java.util.concurrent.Phaser;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-01
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {

    //定义三个参与者，即三个运动员
    Phaser phaser = new Phaser(1);
    //运动员A
    ThreadA threadA = new ThreadA(phaser);
    threadA.setName("threadA");
    threadA.start();

    //运动员B
    ThreadB threadB = new ThreadB(phaser);
    threadB.setName("threadB");
    threadB.start();

    //运动员C
    ThreadC threadC = new ThreadC(phaser);
    threadC.setName("threadC");
    threadC.start();
  }
}
