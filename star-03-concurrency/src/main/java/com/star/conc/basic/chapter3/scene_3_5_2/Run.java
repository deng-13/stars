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
public class Run {

  public static void main(String[] args) {
    Phaser phaser = new Phaser(2) {

      protected boolean onAdvance(int phase, int registeredParties ){

        System.out.println("protected boolean onAdvance() 被调用");
        //返回 true -> 不等待了，phaser 呈无效/销毁状态
        //返回 false -> 继续正常工作
        return false;
      }
    };
    //运动员A
    MyService service = new MyService(phaser);

    ThreadA threadA = new ThreadA(service);
    threadA.setName("thread A");
    threadA.start();

    ThreadB threadB = new ThreadB(service);
    threadB.setName("thread B");
    threadB.start();
  }
}
