package com.star.conc.basic.chapter1.scene1_1_4;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class ThreadB extends Thread{

  private MySemaphore service;

  public ThreadB(MySemaphore service){

    super();
    this.service = service;
  }

  public void run(){
    service.testMethod();
  }
}
