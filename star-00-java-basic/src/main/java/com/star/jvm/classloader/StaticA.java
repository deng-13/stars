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
public class StaticA {

  static {

    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    try {

      Class.forName("com.star.jvm.classloader.StaticB");

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("staticA init ok");
  }
}
