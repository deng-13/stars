package com.star.conc.wangwj.day1.chapter8;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class Service2 {

  private Object lock = new Object();

  private Service1 service1;

  public Service2(Service1 service1) {
    this.service1 = service1;
  }

  public void method(){

    synchronized (lock) {
      System.out.println("service2 -----method ");
      service1.method();
    }
  }
}
