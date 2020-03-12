package com.star.conc.basic.chapter8.scene_8_5_1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {

    ScheduledExecutorService executorService =
        Executors.newSingleThreadScheduledExecutor();

    System.out.println("    x= " + System.currentTimeMillis());

    executorService.scheduleAtFixedRate(new MyRunnable(), 1, 2, TimeUnit.SECONDS);
    System.out.println("    Y= " + System.currentTimeMillis());

  }
}
