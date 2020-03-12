package com.star.design.patterns.structures.decorator.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class FourClassScoreReport extends SchoolReport {

  @Override
  public void report() {

    System.out.println(" 尊敬的家长");
    System.out.println(" 。。。。。");
    System.out.println(" 语文 61 ，数学62 ，地理59 。。。");
    System.out.println(" 。。。。。");
    System.out.println("                     家长签名");
  }

  @Override
  public void sign() {
    System.out.println(" 家长签名为 ： ");
  }
}
