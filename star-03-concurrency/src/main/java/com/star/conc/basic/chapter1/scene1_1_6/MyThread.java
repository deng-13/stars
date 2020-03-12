package com.star.conc.basic.chapter1.scene1_1_6;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MyThread extends Thread{

  private MySemaphore service;

  public MyThread(MySemaphore service){

    super();
    this.service = service;
  }

  public void run(){
    service.testMethod();
  }
}
