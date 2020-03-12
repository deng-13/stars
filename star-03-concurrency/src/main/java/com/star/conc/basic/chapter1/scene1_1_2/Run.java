package com.star.conc.basic.chapter1.scene1_1_2;

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
    Thread[] threads = new ThreadA[10];
    for (int i = 0 ; i < threads.length ; i++){
      threads[i] = new ThreadA(service);
      threads[i].setName("name-" + i);
      threads[i].start();
    }
  }

}
