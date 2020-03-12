package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class LazySimpleExecutorThreadTest {

  public static void main(String[] args) {

//    ExecutorService pool = Executors.newFixedThreadPool(10);
//    for (int i = 0; i < 10; i++) {
//      pool.execute(new LazySimpleExecutorThread());
//
//    }
//
    Thread thread = null;
    for (int i = 0; i < 100; i++) {
      thread = new Thread(new LazySimpleExecutorThread());
      thread.start();

    }

  }
}
