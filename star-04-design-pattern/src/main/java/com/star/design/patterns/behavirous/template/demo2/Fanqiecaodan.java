package com.star.design.patterns.behavirous.template.demo2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class Fanqiecaodan extends CookModel {

  @Override
  public void zhaicai() {

    System.out.println(" 择小葱。。。");
  }

  @Override
  public void xicai() {
    System.out.println(" 洗番茄。。。");
  }

  @Override
  public void caocai() {

    System.out.println(" 放油，放鸡蛋，放番茄，放葱。。。");
  }

  @Override
  public void zhuangpan() {

    System.out.println(" 装盘。。。");
  }
}
