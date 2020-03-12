package com.star.conc.basic.chapter5.scene_5_5_3;

import java.util.concurrent.Callable;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyCallable implements Callable {

  @Override
  public Object call() throws Exception {

    int i = 0;
    while ( i ==0 ){

      // 去掉 isInterrupted 系统会 无限执行，线程不会被取消
      if (Thread.currentThread().isInterrupted() == true){
        throw new InterruptedException();
      }
      System.out.println("系统正在执行中........");
    }
    Thread.sleep(3000);
    return "我的年龄是 1000";
  }
}
