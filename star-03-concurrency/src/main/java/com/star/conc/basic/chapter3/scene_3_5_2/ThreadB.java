package com.star.conc.basic.chapter3.scene_3_5_2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-01
 * @author： xingxingzhao
 */
public class ThreadB extends Thread {

  private MyService myService;

  public ThreadB(MyService myService) {
    super();
    this.myService = myService;
  }

  @Override
  public void run() {

    myService.testMethod();
  }
}
