package com.star.design.patterns.creates.factory_abstract_;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-06
 * @author： xingxingzhao
 */
public abstract class AbstractFactory {

  public abstract Color getColor(String color);
  public abstract Shape getShape(String shape) ;
}
