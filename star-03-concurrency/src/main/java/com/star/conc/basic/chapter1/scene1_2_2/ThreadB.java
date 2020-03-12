package com.star.conc.basic.chapter1.scene1_2_2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Exchanger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class ThreadB extends Thread {

  private Exchanger<Map> exchanger;

  public ThreadB(Exchanger<Map> exchanger){

    super();
    this.exchanger = exchanger;
  }

  @Override
  public void run() {

    try{
      System.out.println("在线程B中得到线程A的值是：" + exchanger.exchange(new HashMap()));

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
