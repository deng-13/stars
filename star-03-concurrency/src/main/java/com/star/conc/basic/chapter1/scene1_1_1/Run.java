package com.star.conc.basic.chapter1.scene1_1_1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {

    MySemaphore service = new MySemaphore();
    Thread thread1 = new ThreadA(service);
    thread1.setName("A");
    thread1.start();

    Thread thread2 = new ThreadB(service);
    thread2.setName("B");
    thread2.start();

    Thread thread3 = new ThreadC(service);
    thread3.setName("C");
    thread3.start();


  }

}
