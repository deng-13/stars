package com.star.design.patterns.creates.builder.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class MainTest {

  public static void main(String[] args) {

    Director director = new Director();
    director.getBaomModel().run();

    director.getBenzAModel().run();

    director.getBenzBModel().run();
  }
}
