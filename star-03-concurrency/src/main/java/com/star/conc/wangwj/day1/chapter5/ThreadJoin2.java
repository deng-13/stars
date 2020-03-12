package com.star.conc.wangwj.day1.chapter5;

import java.util.stream.IntStream;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class ThreadJoin2 {


  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread(() -> {

      try {

        Thread.sleep(10000);
        System.out.println(" thread1 is done");
      } catch (Exception e) {

        e.printStackTrace();
      }
    });

    thread1.start();
    thread1.join(100);

    System.out.println(" all thread is done");

    IntStream.range(1, 1000)
        .forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
  }

}
