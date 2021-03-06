package com.star.conc.basic.chapter4.scene_4_2_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) throws InterruptedException {

    // 创建有界线程池，线程中的线程数量是有个数的
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    for (int i = 0; i < 4; i++) {
      executorService.execute(new MyRunnable(" " + (i + 1)));

    }

    Thread.sleep(2000);
    System.out.println("复用线程池，begin --------------");
    for (int i = 0; i < 4; i++) {
      executorService.execute(new MyRunnable(" " + (i + 1)));

    }

  }
}
