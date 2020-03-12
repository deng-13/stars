package com.star.conc.basic.chapter9.scene_9_2;

import java.util.concurrent.ForkJoinPool;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) throws InterruptedException {

    ForkJoinPool pool = new ForkJoinPool();
    pool.submit(new MyRecursiveAction());

    Thread.sleep(5000);
  }
}
