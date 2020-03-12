package com.star.conc.basic.chapter8.scene_8_4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
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

    try {

      List<Callable> callableList = new ArrayList<>();

      callableList.add(new MyCallableA());

      ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

      ScheduledFuture<String> futureA = executorService
          .schedule(callableList.get(0), 4l, TimeUnit.SECONDS);

      System.out.println("       x=" + System.currentTimeMillis());
      System.out.println("返回值：" + futureA.get());
      System.out.println("       y=" + System.currentTimeMillis());


    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }


  }
}
