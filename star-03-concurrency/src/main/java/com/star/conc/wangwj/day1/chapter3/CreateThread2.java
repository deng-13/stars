package com.star.conc.wangwj.day1.chapter3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class CreateThread2 {

  public static void main(String[] args) {

    Thread thread = new Thread();
    thread.start();
    System.out.println(thread.getThreadGroup());

    System.out.println(Thread.currentThread().getThreadGroup().activeCount());
  }
}
