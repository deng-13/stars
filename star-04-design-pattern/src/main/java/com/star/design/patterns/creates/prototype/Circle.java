package com.star.design.patterns.creates.prototype;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-11
 * @author： xingxingzhao
 */
public class Circle extends Shape {

  public Circle(){
    type = "Circle";
  }

  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }

}
