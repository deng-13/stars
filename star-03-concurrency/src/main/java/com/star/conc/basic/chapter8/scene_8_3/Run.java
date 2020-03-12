package com.star.conc.basic.chapter8.scene_8_3;

import java.util.ArrayList;
import java.util.List;
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

    List<Runnable> runnableList = new ArrayList<>();

    runnableList.add(new MyRunnableA());
    runnableList.add(new MyRunnableB());

    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    System.out.println("       x=" + System.currentTimeMillis());
    executorService.schedule(runnableList.get(0) , 0L, TimeUnit.SECONDS);
    executorService.schedule(runnableList.get(1) , 0L, TimeUnit.SECONDS);
    System.out.println("       y=" + System.currentTimeMillis());
  }
}
