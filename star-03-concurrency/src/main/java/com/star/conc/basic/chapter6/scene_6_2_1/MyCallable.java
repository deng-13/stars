package com.star.conc.basic.chapter6.scene_6_2_1;

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

  private String name;
  private long sleepValues;

  public MyCallable(String name, long sleepValues) {
    this.name = name;
    this.sleepValues = sleepValues;
  }

  @Override
  public Object call() throws Exception {

    System.out.println(name);
    Thread.sleep(sleepValues);
    return "return " + name;
  }
}
