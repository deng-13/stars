package com.star.conc.basic.chapter1.scene1_1_1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class ThreadC extends Thread{

  private MySemaphore service;

  public ThreadC(MySemaphore service){

    super();
    this.service = service;
  }

  public void run(){
    service.testMethod();
  }
}
