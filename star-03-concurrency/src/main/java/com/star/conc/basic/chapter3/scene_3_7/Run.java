package com.star.conc.basic.chapter3.scene_3_7;

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

    // 批量增加 parties 的个数
    phaser.bulkRegister(2);
    System.out.println(phaser.getRegisteredParties());

    phaser.bulkRegister(1);
    System.out.println(phaser.getRegisteredParties());

    phaser.bulkRegister(3);
    System.out.println(phaser.getRegisteredParties());


    phaser.getArrivedParties();
    phaser.getUnarrivedParties();


  }
}
