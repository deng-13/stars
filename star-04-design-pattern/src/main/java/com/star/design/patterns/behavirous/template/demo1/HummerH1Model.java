package com.star.design.patterns.behavirous.template.demo1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class HummerH1Model extends HummerModel {

  @Override
  public void start() {

    System.out.println(" HummerH1 发动 ...");
  }

  @Override
  public void stop() {

    System.out.println(" HummerH1 停止 ...");
  }

  @Override
  public void alarm() {

    System.out.println(" HummerH1 鸣笛 ...");

  }

  @Override
  public void engineBoom() {

    System.out.println(" HummerH1 引擎声音 咚咚咚 ...");
  }

}
