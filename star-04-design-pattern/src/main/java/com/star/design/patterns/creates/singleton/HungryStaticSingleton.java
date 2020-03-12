package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class HungryStaticSingleton {

  private static final HungryStaticSingleton hungrySingleton ;

  static {
    hungrySingleton = new HungryStaticSingleton();
  }

  private HungryStaticSingleton(){

  };

  public HungryStaticSingleton getHungrySingleton(){
    return hungrySingleton;
  }
}
