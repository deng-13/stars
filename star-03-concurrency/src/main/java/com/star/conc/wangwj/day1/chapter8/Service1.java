package com.star.conc.wangwj.day1.chapter8;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class Service1 {

  private Object lock = new Object();

  private Service2 service2;

  public void setService2(Service2 service2) {
    this.service2 = service2;
  }

  public void method(){

    synchronized (lock) {

      System.out.println("service1 -----method ");
      service2.method();
    }
  }
}
