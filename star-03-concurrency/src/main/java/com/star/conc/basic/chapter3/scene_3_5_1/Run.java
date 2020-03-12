package com.star.conc.basic.chapter3.scene_3_5_1;

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
    Phaser phaser = new Phaser(1);
    //运动员A
    ThreadA threadA = new ThreadA(phaser);
    threadA.start();

  }
}
