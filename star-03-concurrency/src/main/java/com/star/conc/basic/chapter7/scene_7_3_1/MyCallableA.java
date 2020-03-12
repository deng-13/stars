package com.star.conc.basic.chapter7.scene_7_3_1;

import java.util.concurrent.Callable;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyCallableA implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println("MyCallableA begin " + System.currentTimeMillis());

    for (int i = 0; i < 123456 ; i++) {

      Math.random();
      Math.random();
      Math.random();
      Math.random();

      System.out.println("MyCallableA " + (i + 1));
    }
    return "returnA";
  }
}
