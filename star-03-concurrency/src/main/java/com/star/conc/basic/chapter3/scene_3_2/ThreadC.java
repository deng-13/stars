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
public class ThreadC extends Thread {

  private Phaser phaser;

  public ThreadC(Phaser phaser) {
    super();
    this.phaser = phaser;
  }

  @Override
  public void run() {

    PrintTools.method();
  }
}
