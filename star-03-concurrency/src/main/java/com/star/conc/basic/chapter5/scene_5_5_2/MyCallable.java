package com.star.conc.basic.chapter5.scene_5_5_2;

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
      if (Thread.currentThread().isInterrupted()){
        throw new InterruptedException();
      }
      System.out.println("系统正在执行中........");
    }
    Thread.sleep(3000);
    return "我的年龄是 1000";
  }
}
