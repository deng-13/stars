package com.star.conc.basic.chapter1.scene1_1_7;

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

    MyThread[] myThreads = new MyThread[10];
    for (int i = 0 ; i < myThreads.length ; i++){
      myThreads[i] = new MyThread(service);
      myThreads[i].start();
    }
  }

}
