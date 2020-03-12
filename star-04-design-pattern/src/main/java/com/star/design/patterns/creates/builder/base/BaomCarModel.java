package com.star.design.patterns.creates.builder.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class BaomCarModel extends CarModel {

  @Override
  protected void start() {
    System.out.println(" 宝马 发动");
  }

  @Override
  protected void stop() {
    System.out.println(" 宝马 停");

  }

  @Override
  protected void alarm() {
    System.out.println(" 宝马 响铃");

  }

  @Override
  protected void engineBoom() {
    System.out.println(" 宝马 发动机响了 ");

  }
}
