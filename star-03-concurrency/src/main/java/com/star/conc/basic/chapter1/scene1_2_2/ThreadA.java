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
public class ThreadA extends Thread {

  private Exchanger<Map> exchanger;

  public ThreadA(Exchanger<Map> exchanger){

    super();
    this.exchanger = exchanger;
  }

  @Override
  public void run() {

    try{
      Map<String,String> test = new HashMap<String,String>();
      test.put("test1","ok1");
      test.put("test2","ok2");

      System.out.println("在线程A中得到线程B的值是：" + exchanger.exchange(test));

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
