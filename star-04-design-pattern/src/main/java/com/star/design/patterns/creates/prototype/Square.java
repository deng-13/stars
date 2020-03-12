package com.star.design.patterns.creates.prototype;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-11
 * @author： xingxingzhao
 */
public class Square extends Shape {

  public Square(){
    type = "Square";
  }

  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}