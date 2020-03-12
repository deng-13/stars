package com.star.conc.basic.chapter5.scene_5_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {
    MyCallable callable = new MyCallable(4);

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    Future<String> future = poolExecutor.submit(callable);

    System.out.println("main A " + System.currentTimeMillis());
    try {
      System.out.println(future.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    System.out.println("main B " + System.currentTimeMillis());

  }
}
