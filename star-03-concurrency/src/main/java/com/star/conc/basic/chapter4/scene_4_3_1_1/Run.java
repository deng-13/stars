package com.star.conc.basic.chapter4.scene_4_3_1_1;

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

    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<>());

    System.out.println(threadPoolExecutor.getCorePoolSize());
    System.out.println(threadPoolExecutor.getMaximumPoolSize());
    System.out.println(" ");

    threadPoolExecutor = new ThreadPoolExecutor(1, 3, 5, TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<>());

    System.out.println(threadPoolExecutor.getCorePoolSize());
    System.out.println(threadPoolExecutor.getMaximumPoolSize());
  }

}
