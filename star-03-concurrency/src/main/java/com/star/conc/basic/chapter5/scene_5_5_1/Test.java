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
public class Test {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    MyCallable callable = new MyCallable();

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    Future future =poolExecutor.submit(callable);
    System.out.println(future.get());

    // 线程任务执行完毕，线程对象已经销毁，cancel() -> false 代表取消命令没有成功
    System.out.println(future.cancel(true) + " " + future.isCancelled());
  }
}
