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
public class MyCallableB implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println("MyCallableB begin " + System.currentTimeMillis());

    for (int i = 0; i < 223456 ; i++) {

      Math.random();
      Math.random();
      Math.random();
      Math.random();

      System.out.println("MyCallableB " + (i + 1));
    }

    if(true){
      System.out.println("报错了 BBBBBBBB");
      throw new NullPointerException();
    }

    System.out.println("MyCallableB end " + System.currentTimeMillis());
    return "returnB";
  }
}
