package com.star.design.patterns.structures.decorator.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class Father {

  public static void main(String[] args) {

    SchoolReport sr;

    sr = new FourClassScoreReport();
    sr = new HighScoreDecorator(sr);
    sr = new SortDecorator(sr);
    sr.report();
    sr.sign();

  }
}
