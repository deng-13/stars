package com.star.design.patterns.creates.builder.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class BenzCarModel extends CarModel {

  @Override
  protected void start() {
    System.out.println(" 奔驰车 发动");
  }

  @Override
  protected void stop() {
    System.out.println(" 奔驰车 停");

  }

  @Override
  protected void alarm() {
    System.out.println(" 奔驰车 响铃");

  }

  @Override
  protected void engineBoom() {
    System.out.println(" 奔驰车发动机响了 ");

  }
}
