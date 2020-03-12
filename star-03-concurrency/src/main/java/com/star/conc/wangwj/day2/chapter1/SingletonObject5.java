package com.star.conc.wangwj.day2.chapter1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-09
 * @author： xingxingzhao
 */
public class SingletonObject5 {

  private static volatile SingletonObject5 instance;

  private SingletonObject5(){}

  private static SingletonObject5 getInstance(){

    if (null == instance){
      synchronized (SingletonObject5.class) {
        if (null == instance){
          instance = new SingletonObject5();
        }
      }
    }
    return instance;
  }
}
