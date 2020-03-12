package com.star.conc.wangwj.day2.chapter1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-09
 * @author： xingxingzhao
 */
public class SingletonObject4 {

  private static SingletonObject4 instance;

  private SingletonObject4(){}

  private static SingletonObject4 getInstance(){

    if (null == instance){
      synchronized (SingletonObject4.class) {
        if (null == instance){
          instance = new SingletonObject4();
        }
      }
    }
    return instance;
  }
}
