package com.star.conc.basic.chapter3.scene_3_6;

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

    Phaser phaser = new Phaser(3);
    System.out.println(phaser.getRegisteredParties());

    // 动态添加一个 parties 的值
    phaser.register();
    System.out.println(phaser.getRegisteredParties());

    phaser.register();
    System.out.println(phaser.getRegisteredParties());

    phaser.register();
    System.out.println(phaser.getRegisteredParties());




  }
}
