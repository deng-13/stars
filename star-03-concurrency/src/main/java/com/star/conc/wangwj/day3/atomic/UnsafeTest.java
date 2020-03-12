package com.star.conc.wangwj.day3.atomic;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/**
 * <p>
 *
 * StupidCounter
 *  Counter result :92081493
 *  Time passed in ms: 233
 * SynCounter:
 *  Counter result :100000000
 *  Time passed in ms: 3216
 * LockCounter:
 *  Counter result :100000000
 *  Time passed in ms: 3183
 * AtomicCounter:
 *  Counter result :100000000
 *  Time passed in ms: 2153
 * CasCounter
 *  Counter result :100000000
 *  Time passed in ms: 12870
 * </p>
 *
 * @created： 2020-03-10
 * @author： xingxingzhao
 */
public class UnsafeTest {

  public static void main(String[] args) throws InterruptedException, NoSuchFieldException {

//    Unsafe unsafe = getUnsafe();
//    System.out.println(unsafe);

    ExecutorService service = Executors.newFixedThreadPool(1000);

    Counter counter = new CasCounter();
    long start = System.currentTimeMillis();

    for (int i = 0; i < 1000; i++) {
      service.submit(new CounterRunnable(counter, 100000));
    }

    service.shutdown();
    service.awaitTermination(1, TimeUnit.HOURS);
    long end = System.currentTimeMillis();

    System.out.println("Counter result :" + counter.getCounter());
    System.out.println("Time passed in ms: " + (end - start));
  }

  private static Unsafe getUnsafe() {

    try {
      Field f = Unsafe.class.getDeclaredField("theUnsafe");
      f.setAccessible(true);

      return (Unsafe) f.get(null);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  interface Counter {

    void increment();

    long getCounter();
  }

  static class StupidCounter implements Counter {

    private long count = 0;

    @Override
    public void increment() {
      count++;
    }

    @Override
    public long getCounter() {
      return count;
    }
  }

  static class SynCounter implements Counter {

    private long count = 0;

    @Override
    public synchronized void increment() {
      count++;
    }

    @Override
    public long getCounter() {
      return count;
    }
  }

  static class LockCounter implements Counter {

    private long count = 0;

    private Lock lock = new ReentrantLock();

    @Override
    public void increment() {
      try {
        lock.lock();
        count++;

      } finally {
        lock.unlock();
      }
    }

    @Override
    public long getCounter() {
      return count;
    }
  }

  static class AtomicCounter implements Counter {

    private AtomicLong count = new AtomicLong();

    @Override
    public void increment() {
      count.incrementAndGet();
    }

    @Override
    public long getCounter() {
      return count.get();
    }
  }

  static class CasCounter implements Counter {

    private volatile long counter = 0;

    private Unsafe unsafe;
    private long offset;

    CasCounter() throws NoSuchFieldException {

      unsafe = getUnsafe();
      offset = unsafe.objectFieldOffset(CasCounter.class.getDeclaredField("counter"));
    }

    @Override
    public void increment() {
      long current = counter;
      while (!unsafe.compareAndSwapLong(this, offset, current, current + 1)) {
        current = counter;
      }
    }

    @Override
    public long getCounter() {
      return counter;
    }
  }

  static class CounterRunnable implements Runnable {


    private final Counter counter;

    private final int num;

    public CounterRunnable(Counter counter, int num) {
      this.counter = counter;
      this.num = num;
    }

    @Override
    public void run() {

      for (int i = 0; i < 100000; i++) {
        counter.increment();
      }
    }
  }
}

