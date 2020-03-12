package com.star.conc.basic.chapter5.scene_5_2;

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

  private int age ;

  public MyCallable(int age) {
    this.age = age;
  }

  @Override
  public Object call() throws Exception {
    Thread.sleep(2000);
    return "返回值年龄是" + age;
  }
}
