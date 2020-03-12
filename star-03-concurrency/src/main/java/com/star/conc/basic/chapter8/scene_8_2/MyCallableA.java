package com.star.conc.basic.chapter8.scene_8_2;

import java.util.concurrent.Callable;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class MyCallableA implements Callable<String> {

  @Override
  public String call() throws Exception {

    System.out.println("MyCallableA begin " + System.currentTimeMillis());


    System.out.println("MyCallableA end " + System.currentTimeMillis());


    return "returnA";
  }
}
