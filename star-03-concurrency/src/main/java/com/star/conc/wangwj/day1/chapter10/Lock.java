package com.star.conc.wangwj.day1.chapter10;

import java.util.Collection;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public interface Lock {

  class TimeoutException extends Exception{

    @Override
    public void printStackTrace() {
      System.out.println("My lock timeout exception");
    }
  }

  void lock() throws InterruptedException;

  void lock(long mills) throws InterruptedException, TimeoutException;

  void unLock() throws InterruptedException, TimeoutException;

  Collection<Thread> getBlockedThread();

  int getBlockedThreadSize();
}
