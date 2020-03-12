package com.star.conc.wangwj.day1.chapter9;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ProduceConsumerV2 {


  private int i = 0;

  private Object lock = new Object();

  private volatile boolean isProduced = false;

  public void produce() {

    synchronized (lock) {

      if (isProduced) {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      } else {
        System.out.println(" p -> " + (++i));
        isProduced = true;
        lock.notify();

      }
    }
  }

  public void consumer() {

    synchronized (lock) {
      if (isProduced){
        System.out.println(" c -> " + i);
        lock.notify();
        isProduced = false;
      } else {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }


    }
  }

  public static void main(String[] args) {

    ProduceConsumerV2 v1 = new ProduceConsumerV2();

    new Thread() {

      @Override
      public void run() {
        while (true) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          v1.produce();
        }
      }
    }.start();

    new Thread() {

      @Override
      public void run() {
        while (true) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          v1.consumer();
        }
      }
    }.start();
  }
}
