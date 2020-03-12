package com.star.conc.wangwj.day1.chapter9;

import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ProduceConsumerV3 {


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
        i++;
        System.out.println(" p -> " + i);
        isProduced = true;
        lock.notifyAll();

      }
    }
  }

  public void consumer() {

    synchronized (lock) {
      if (isProduced) {
        System.out.println(" c -> " + i);
        lock.notifyAll();
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

    ProduceConsumerV3 v1 = new ProduceConsumerV3();

    Stream.of("p1", "p2","p3", "p4").forEach(p -> {
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
    });

    Stream.of("c1", "c2","c3", "c4").forEach(c -> {
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
    });

  }
}
