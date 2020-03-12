package com.star.conc.basic.chapter2.scene2_2_1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class MyThread extends Thread {

  private CyclicBarrier cyclicBarrier;

  public MyThread(CyclicBarrier cyclicBarrier){
    super();
    this.cyclicBarrier = cyclicBarrier;
  }

  @Override
  public void run(){

    try{
      System.out.println(Thread.currentThread().getName() + "come in = "  + " 等凑齐两个继续执行");
      cyclicBarrier.await();
      System.out.println(Thread.currentThread().getName() + "end = "  + " 已经凑齐两个继续执行");

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }
  }
}
