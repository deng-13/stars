package com.star.conc.basic.chapter5.scene_5_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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

    ExecutorService service = Executors.newCachedThreadPool();

    ThreadPoolExecutor executor = (ThreadPoolExecutor)service;

    executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());

    service.submit(new MyRunnable("A"));
    service.submit(new MyRunnable("B"));
    service.submit(new MyRunnable("C"));
    service.submit(new MyRunnable("D"));
    executor.shutdown();
    service.submit(new MyRunnable("E"));

  }
}
