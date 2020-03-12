package com.star.conc.basic.chapter3.scene_3_9;

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

    // A1,A2 B1,B2 C1,C2是因为 new Phaser.parties = 2
    Phaser phaser = new Phaser(2){

      protected boolean onAdvance(int phase , int registeredParties){

        System.out.println("到达了未通过！ phaser=" + phase + "registeredParties= " + registeredParties);
        return super.onAdvance(phase, registeredParties);
      }
    };

    System.out.println("A1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("A1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());

    System.out.println("A2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("A2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());

    System.out.println("B1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("B1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());

    System.out.println("B2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("B2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());

    System.out.println("C1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("C1 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());

    System.out.println("C2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
    phaser.arrive();
    System.out.println("C2 getPhase = " + phaser.getPhase()
        + "getRegisteredParties" + phaser.getRegisteredParties()
        + "getArrivedParties"+ phaser.getArrivedParties());
  }
}
