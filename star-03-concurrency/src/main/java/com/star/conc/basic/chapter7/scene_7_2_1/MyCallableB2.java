package com.star.conc.basic.chapter7.scene_7_2_1;

import java.util.concurrent.Callable;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyCallableB2 implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println("MyCallableB2 begin " + System.currentTimeMillis());

    for (int i = 0; i < 223456 ; i++) {

      if (Thread.currentThread().isInterrupted() == false){
        Math.random();
        Math.random();
        Math.random();
        Math.random();

        System.out.println("MyCallableB2 " + (i + 1));
      } else {
        System.out.println("---------抛出异常中断了");
        throw new InterruptedException();
      }

    }
    System.out.println("MyCallableB2 end " + System.currentTimeMillis());

    return "returnB";
  }
}
