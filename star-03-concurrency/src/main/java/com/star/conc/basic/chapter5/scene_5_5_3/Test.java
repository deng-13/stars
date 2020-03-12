package com.star.conc.basic.chapter5.scene_5_5_3;

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

  public static void main(String[] args) throws InterruptedException {

    MyCallable callable = new MyCallable();

    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 6, 0l, TimeUnit.SECONDS,
        new LinkedBlockingDeque<>());

    Future future =poolExecutor.submit(callable);
    Thread.sleep(2000);
    //cancel() -> true 代表取消命令成功 ；isCancelled() -> true 代表已取消
    System.out.println(future.cancel(false) + " " + future.isCancelled());

  }
}
