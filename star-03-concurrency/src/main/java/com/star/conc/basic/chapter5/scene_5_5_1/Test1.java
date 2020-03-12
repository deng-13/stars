package com.star.conc.basic.chapter5.scene_5_5_1;

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
public class Test1 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    MyCallable callable = new MyCallable();

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    Future future =poolExecutor.submit(callable);

    //cancel() -> true 代表取消命令成功 ；isCancelled() -> true 代表已取消
    System.out.println(future.cancel(true) + " " + future.isCancelled());
  }
}
