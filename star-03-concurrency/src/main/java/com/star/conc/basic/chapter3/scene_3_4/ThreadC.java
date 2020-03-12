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
public class ThreadC extends Thread {

  private Phaser phaser;

  public ThreadC(Phaser phaser) {
    super();
    this.phaser = phaser;
  }

  @Override
  public void run() {

    // 线程c 调用methodC ，中途退场 ，不参加第二阶段的比赛
    PrintTools.methodC();
  }
}
