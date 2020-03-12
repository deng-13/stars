package com.star.basic.threadTest;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-29
 * @author： xingxingzhao
 */
public class DeadLockDemo {


  private static Object resource1 = new Object();
  private static Object resource2 = new Object();

  public static void main(String[] args) {

    new Thread(() -> {

      synchronized (resource1) {
        System.out.println(Thread.currentThread() + "get resource1");

        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println(Thread.currentThread() + "waiting get resource2");
        synchronized (resource2) {
          System.out.println(Thread.currentThread() + "get resource2");
        }
      }
    }, "线程 1").start();

    new Thread(() -> {
      synchronized (resource2) {
        System.out.println(Thread.currentThread() + "get resource2");

        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println(Thread.currentThread() + "waiting get resource1");
        synchronized (resource1) {
          System.out.println(Thread.currentThread() + "get resource1");
        }
      }
    }, "线程 2").start();

    /*  打破 死锁 resource1 <-> resource2
    new Thread(() -> {
      synchronized (resource1) {
        System.out.println(Thread.currentThread() + "get resource2");

        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println(Thread.currentThread() + "waiting get resource1");
        synchronized (resource2) {
          System.out.println(Thread.currentThread() + "get resource1");
        }
      }
    }, "线程 2").start();

     */
  }
}
