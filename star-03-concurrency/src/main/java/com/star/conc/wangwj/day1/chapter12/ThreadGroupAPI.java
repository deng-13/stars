package com.star.conc.wangwj.day1.chapter12;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ThreadGroupAPI {

  public static void main(String[] args) {

    ThreadGroup tg1 = new ThreadGroup("tg1");

    Thread thread = new Thread(tg1,"t1"){

      @Override
      public void run() {
        System.out.println(getThreadGroup().getName());
        System.out.println(getThreadGroup().getParent().getName());
      }
    };
    thread.start();

  }
}
