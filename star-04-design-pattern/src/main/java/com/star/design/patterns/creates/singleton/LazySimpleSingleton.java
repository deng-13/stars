package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class LazySimpleSingleton {

  private LazySimpleSingleton(){

  };

  private static LazySimpleSingleton lazy = null;

  public synchronized static LazySimpleSingleton getInstance(){

    if (lazy == null){
      lazy = new LazySimpleSingleton();
    }
    return lazy;
  }
}
