package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class HungrySingleton {

  private static final HungrySingleton hungrySingleton = new HungrySingleton();

  private HungrySingleton(){};

  public static HungrySingleton getInstance(){
    return hungrySingleton;
  }
}
