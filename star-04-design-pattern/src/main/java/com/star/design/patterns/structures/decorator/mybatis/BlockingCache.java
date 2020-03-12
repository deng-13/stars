package com.star.design.patterns.structures.decorator.mybatis;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class BlockingCache implements Cache {

  private long timeout;
  private final Cache delegate;
  private final ConcurrentHashMap<Object, ReentrantLock> locks;

  public BlockingCache(Cache delegate,
      ConcurrentHashMap<Object, ReentrantLock> locks) {
    this.delegate = delegate;
    this.locks = new ConcurrentHashMap<>();
  }

  @Override
  public String getId() {
    return delegate.getId();
  }

  @Override
  public Object getObject(Object key) {

    acquireLock(key);
    Object value = delegate.getObject(key);
    if (value != null) {
      releaseLock(key);
    }
    return value;
  }

  @Override
  public void putObject(Object key, Object value) {

    try {
      delegate.putObject(key, value);
    } finally {
      releaseLock(key);
    }
  }

  @Override
  public Object removeObject(Object key) {
    releaseLock(key);
    return null;
  }

  @Override
  public void clear() {
    delegate.clear();
  }

  @Override
  public int getSize() {
    return delegate.getSize();
  }

  private void acquireLock(Object key){

    Lock lock = getLockForKey(key);
    if (timeout > 0){
      try {
        boolean acquired = lock.tryLock(timeout, TimeUnit.MILLISECONDS);
        if (!acquired){
          throw new Exception("Couldn't get a lock in " + timeout + " for the key " +  key + " at the cache " + delegate.getId());
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      lock.lock();
    }

  }

  private ReentrantLock getLockForKey(Object key){

    return locks.computeIfAbsent(key, k -> new ReentrantLock());

  }

  private void releaseLock(Object key){
    ReentrantLock lock = locks.get(key);
    if (lock.isHeldByCurrentThread()){
      lock.unlock();
    }
  }
}
