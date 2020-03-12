package com.star.jvm.classloader;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-12
 * @author： xingxingzhao
 */
public class StaticB {

  static {

    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    try {

      Class.forName("com.star.jvm.classloader.StaticA");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("staticB init ok");
  }
}
