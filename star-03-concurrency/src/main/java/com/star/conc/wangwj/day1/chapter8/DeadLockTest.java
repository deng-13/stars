package com.star.conc.wangwj.day1.chapter8;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class DeadLockTest {


  public static void main(String[] args) {


    Service1 service1 = new Service1();

    Service2 service2 = new Service2(service1);
    service1.setService2(service2);


    new Thread() {
      @Override
      public void run() {
        service1.method();
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        service2.method();
      }
    }.start();
  }

}
