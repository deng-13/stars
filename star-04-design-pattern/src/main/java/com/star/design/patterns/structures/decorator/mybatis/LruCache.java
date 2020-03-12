package com.star.design.patterns.structures.decorator.mybatis;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class LruCache implements Cache {

  private final Cache delegate;
  private Map<Object, Object> keyMap;
  private Object eldestKey;

  public LruCache(Cache delegate) {
    this.delegate = delegate;
    setSize(1024);
  }

  public void setSize(final int size) {

    keyMap = new LinkedHashMap<Object, Object>(size, 0.75F, true) {
      private static final long serialVersionUID = 4267176411845948333L;

      @Override
      protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest) {
        boolean tooBig = size() > size;
        if (tooBig) {
          eldestKey = eldest.getKey();
        }
        return tooBig;
      }
    };
  }

  @Override
  public String getId() {
    return this.delegate.getId();
  }

  @Override
  public Object getObject(Object key) {
    keyMap.get(key);
    return this.delegate.getObject(key);
  }

  @Override
  public void putObject(Object key, Object value) {

    delegate.putObject(key, value);
    cycleKeyList(key);
  }

  @Override
  public Object removeObject(Object key) {
    return this.delegate.removeObject(key);
  }

  @Override
  public void clear() {
    delegate.clear();
    keyMap.clear();
  }

  @Override
  public int getSize() {
    return this.delegate.getSize();
  }

  public void cycleKeyList(Object key) {

    keyMap.put(key, key);
    if (eldestKey != null) {
      delegate.removeObject(key);
      eldestKey = null;
    }
  }
}
