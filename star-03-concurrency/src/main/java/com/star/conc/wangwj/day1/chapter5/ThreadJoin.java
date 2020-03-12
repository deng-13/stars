package com.star.conc.wangwj.day1.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class ThreadJoin {

  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread(() -> {

      IntStream.range(1, 1000)
          .forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
    });

    Thread thread2 = new Thread(() -> {

      IntStream.range(1, 1000)
          .forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
    });

    thread1.start();
    thread2.start();

    // 线程1，线程2 交互进行
    thread1.join();
    thread2.join();

    System.out.println(" all thread is done");

    // 主线程等 线程1 ，线程2 结束后，执行
    IntStream.range(1, 1000)
        .forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
  }
}
