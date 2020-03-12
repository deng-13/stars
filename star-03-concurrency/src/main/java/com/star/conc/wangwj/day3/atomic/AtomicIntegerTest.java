package com.star.conc.wangwj.day3.atomic;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-09
 * @author： xingxingzhao
 */
public class AtomicIntegerTest {

  public static void main(String[] args) throws InterruptedException {

    Set<Object> set = Collections.synchronizedSet(new HashSet<>());
    AtomicInteger atomicInteger = new AtomicInteger();

    Thread t = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 500; i++) {
          int j = atomicInteger.getAndIncrement();
          set.add(j);
        }

      }
    };

    Thread t1 = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 500; i++) {
          int j = atomicInteger.getAndIncrement();
          set.add(j);
        }
      }
    };

    Thread t2 = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 500; i++) {
          int j = atomicInteger.getAndIncrement();
          set.add(j);
        }
      }
    };
    t.start();
    t1.start();
    t2.start();

    t.join();
    t1.join();
    t2.join();
    System.out.println(set.size());

  }
}
