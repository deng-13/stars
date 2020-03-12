package com.star.conc.wangwj.day1.chapter9;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ProduceConsumerV1 {


  private volatile int i = 1;

  private Object lock = new Object();

  public void produce(){

    synchronized (lock) {

        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println( " p -> " + i++);
    }
  }

  public void consumer(){

    synchronized (lock) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println( " c -> " + i);
      }
  }

  public static void main(String[] args) {

    ProduceConsumerV1 v1 = new ProduceConsumerV1();

    new Thread(){

      @Override
      public void run() {
        while (true)
        v1.produce();
      }
    }.start();

    new Thread(){

      @Override
      public void run() {
        while (true)
          v1.consumer();
      }
    }.start();
  }
}
