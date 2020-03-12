package com.star.conc.wangwj.day1.chapter3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class CreateThread {

  public static void main(String[] args) {
    Thread t1 = new Thread();
    Thread t2 = new Thread(() ->{
      System.out.println("create thread");
    });

    t1.start();
    t2.start();

    System.out.println(t1.getName());
    System.out.println(t2.getName());

    Thread thread1 = new Thread("myThread");
    thread1.start();

    new Thread(() ->{
      System.out.println("current thread: " + Thread.currentThread().getName());
    },"runnableThread").start();

  }
}
