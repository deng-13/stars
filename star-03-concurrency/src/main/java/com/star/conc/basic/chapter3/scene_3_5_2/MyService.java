package com.star.conc.basic.chapter3.scene_3_5_2;

import java.util.concurrent.Phaser;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-01
 * @author： xingxingzhao
 */
public class MyService {

  private Phaser phaser;

  public MyService(Phaser phaser) {
    this.phaser = phaser;
  }

  public void testMethod(){

    try {
      System.out.println("A begin ThreadName= " + Thread.currentThread().getName() + "     " + System.currentTimeMillis());

      if (Thread.currentThread().getName().equals("B")){
        Thread.sleep(50000);
      }
      phaser.arriveAndAwaitAdvance();
      System.out.println("A end ThreadName= " + Thread.currentThread().getName() + "  phaser value =" + phaser.getPhase());

      System.out.println("B begin ThreadName= " + Thread.currentThread().getName() + "     " + System.currentTimeMillis());

      if (Thread.currentThread().getName().equals("B")){
        Thread.sleep(50000);
      }
      phaser.arriveAndAwaitAdvance();
      System.out.println("B end ThreadName= " + Thread.currentThread().getName() + "  phaser value =" + phaser.getPhase());

      System.out.println("C begin ThreadName= " + Thread.currentThread().getName() + "     " + System.currentTimeMillis());

      if (Thread.currentThread().getName().equals("B")){
        Thread.sleep(50000);
      }
      phaser.arriveAndAwaitAdvance();
      System.out.println("C end ThreadName= " + Thread.currentThread().getName() + "  phaser value =" + phaser.getPhase());

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
