package com.star.conc.basic.chapter1.scene1_1_7;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MyThread extends Thread{

  private MySemaphore semaphore;

  public MyThread(MySemaphore semaphore){

    super();
    this.semaphore = semaphore;
  }

  public void run(){

    System.out.println("ThreadName=" + this.getName() + "启动了");
    semaphore.testMethod();
  }
}
