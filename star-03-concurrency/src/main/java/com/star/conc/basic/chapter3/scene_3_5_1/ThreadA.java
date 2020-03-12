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
public class ThreadA extends Thread {

  private Phaser phaser;

  public ThreadA(Phaser phaser) {
    super();
    this.phaser = phaser;
  }

  @Override
  public void run() {

    System.out.println("A begin");
    phaser.arriveAndAwaitAdvance();
    System.out.println("A end phaser value =" + phaser.getPhase());

    System.out.println("A begin");
    phaser.arriveAndAwaitAdvance();
    System.out.println("A end phaser value =" + phaser.getPhase());

    System.out.println("A begin");
    phaser.arriveAndAwaitAdvance();
    System.out.println("A end phaser value =" + phaser.getPhase());

    System.out.println("A begin");
    phaser.arriveAndAwaitAdvance();
    System.out.println("A end phaser value =" + phaser.getPhase());
  }
}
