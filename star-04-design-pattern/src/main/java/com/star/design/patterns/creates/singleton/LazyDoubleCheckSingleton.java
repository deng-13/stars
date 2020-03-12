package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class LazyDoubleCheckSingleton {

  private static volatile LazyDoubleCheckSingleton lazy = null;

  private LazyDoubleCheckSingleton() {
  }

  public static LazyDoubleCheckSingleton getInstance() {

    if (lazy == null) {
      synchronized (LazyDoubleCheckSingleton.class) {

        if (lazy == null) {
          System.out.println("被创建了");
          lazy = new LazyDoubleCheckSingleton();
        }
      }
    }
    return lazy;
  }
}
