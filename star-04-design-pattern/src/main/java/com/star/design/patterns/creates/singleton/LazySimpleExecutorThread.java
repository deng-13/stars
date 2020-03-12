package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class LazySimpleExecutorThread implements Runnable {

  @Override
  public void run() {

    //LazySimpleSingleton simpleSingleton =  LazySimpleSingleton.getInstance();
    LazyDoubleCheckSingleton simpleSingleton =  LazyDoubleCheckSingleton.getInstance();
    System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
  }
}
