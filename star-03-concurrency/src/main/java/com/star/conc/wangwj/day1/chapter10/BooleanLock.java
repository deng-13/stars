package com.star.conc.wangwj.day1.chapter10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class BooleanLock implements Lock {

  // initValue = false -> 锁被释放
  // initValue = true -> 锁被取走
  private boolean initValue;

  private final Collection<Thread> blockedThreadCollection = new ArrayList<>();

  private Thread currentThread;

  public BooleanLock() {
    this.initValue = false;
  }

  @Override
  public synchronized void lock() throws InterruptedException {

    while (initValue) {
      blockedThreadCollection.add(Thread.currentThread());
      this.wait();
    }

    blockedThreadCollection.remove(Thread.currentThread());
    this.initValue = true;
    this.currentThread = Thread.currentThread();

  }

  @Override
  public synchronized void lock(long mills) throws InterruptedException, TimeoutException {

    if (mills <= 0) {
      lock();
    }

    long hasRemaining = mills;
    long endTime = System.currentTimeMillis() + mills;

    while (initValue) {

      if (hasRemaining <= 0) {
        throw new TimeoutException();

      }

      blockedThreadCollection.add(Thread.currentThread());
      this.wait();
      hasRemaining = endTime - System.currentTimeMillis() ;
    }

    blockedThreadCollection.remove(Thread.currentThread());
    this.initValue = true;
    this.currentThread = Thread.currentThread();

  }

  @Override
  public synchronized void unLock() throws InterruptedException, TimeoutException {

    if (currentThread == Thread.currentThread()) {
      this.initValue = false;
      this.notifyAll();
      System.out.println(Thread.currentThread().getName() + " lock is free");
    }

  }

  @Override
  public Collection<Thread> getBlockedThread() {
    return Collections.unmodifiableCollection(blockedThreadCollection);
  }

  @Override
  public int getBlockedThreadSize() {
    return blockedThreadCollection.size();
  }
}
