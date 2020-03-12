package com.star.design.patterns.behavirous.template.demo1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class MainTest {

  public static void main(String[] args) {

    HummerH1Model h1Model = new HummerH1Model();
    h1Model.run();

    HummerH2Model h2Model = new HummerH2Model();
    h2Model.run();
  }
}
