package com.star.conc.basic.chapter7.scene_7_5;

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

    for (int i = 0; i < 123 ; i++) {

      Math.random();
      Math.random();
      Math.random();
      Math.random();

      System.out.println("MyCallableA " + (i + 1));
    }

    if(true){
      System.out.println("报错了 AAAAAAAA");
      throw new NullPointerException();
    }

    System.out.println("MyCallableA end " + System.currentTimeMillis());


    return "returnA";
  }
}
