package com.star.conc.basic.chapter1.scene1_1_2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class ThreadA extends Thread{

  private MySemaphore service;

  public ThreadA(MySemaphore service){

    super();
    this.service = service;
  }

  public void run(){
    service.testMethod();
  }
}
