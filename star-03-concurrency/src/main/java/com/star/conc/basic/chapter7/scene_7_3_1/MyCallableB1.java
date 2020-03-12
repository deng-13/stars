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
public class MyCallableB1 implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println("MyCallableB1 begin " + System.currentTimeMillis());

    for (int i = 0; i < 223456 ; i++) {

      Math.random();
      Math.random();
      Math.random();
      Math.random();

      System.out.println("MyCallableB1 " + (i + 1));
    }

    if(true){
      System.out.println("xxxxxxxxxxx= 中断了");
      throw new NullPointerException();
    }

    System.out.println("MyCallableB1 end " + System.currentTimeMillis());
    return "returnB";
  }
}
