package com.star.conc.basic.chapter1.scene1_2_1;

import java.util.concurrent.Exchanger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-11-30
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {

    Exchanger<String> exchanger = new Exchanger<String>();

    ThreadA a = new ThreadA(exchanger);
    a.start();

    System.out.println("main end");
  }
}
