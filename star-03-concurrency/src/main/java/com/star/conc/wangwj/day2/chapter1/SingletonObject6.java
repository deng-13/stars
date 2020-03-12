package com.star.conc.wangwj.day2.chapter1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-09
 * @author： xingxingzhao
 */
public class SingletonObject6 {


  private SingletonObject6() {
  }

  private static class instanceHolder {

    private final static SingletonObject6 instance = new SingletonObject6();
  }

  private static SingletonObject6 getInstance() {

    return instanceHolder.instance;
  }
}
