package com.star.conc.basic.chapter1.scene1_2_2;

import java.util.Map;
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

    Exchanger<Map> exchanger = new Exchanger<Map>();

    ThreadA a = new ThreadA(exchanger);
    ThreadB b = new ThreadB(exchanger);
    a.start();
    b.start();

  }
}
