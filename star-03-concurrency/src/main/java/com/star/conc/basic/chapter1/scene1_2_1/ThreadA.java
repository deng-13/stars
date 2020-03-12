package com.star.conc.basic.chapter1.scene1_2_1;

import java.util.concurrent.Exchanger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class ThreadA extends Thread {

  private Exchanger<String> exchanger;

  public ThreadA(Exchanger<String> exchanger){

    super();
    this.exchanger = exchanger;
  }

  @Override
  public void run() {

    try{
      System.out.println("在线程A中得到线程B的值是：" + exchanger.exchange("testA"));

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
