package com.star.design.patterns.creates.factory_abstract_;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-06
 * @author： xingxingzhao
 */
public class FactoryProducer {

  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("SHAPE")) {
      return new ShapeFactory();
    } else if (choice.equalsIgnoreCase("COLOR")) {
      return new ColorFactory();
    }
    return null;
  }

}
