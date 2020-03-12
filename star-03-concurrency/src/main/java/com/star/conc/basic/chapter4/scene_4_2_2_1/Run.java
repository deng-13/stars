package com.star.conc.basic.chapter4.scene_4_2_2_1;

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

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < 5; i++) {
      executorService.execute(new MyRunnable(" " + (i + 1)));

    }
  }
}
