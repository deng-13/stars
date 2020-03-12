package com.star.design.patterns.creates.prototype;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-11
 * @author： xingxingzhao
 */
public class Rectangle extends Shape  {

  public Rectangle(){
    type = "Rectangle";
  }

  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
