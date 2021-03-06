package com.star.design.patterns.creates.factory_abstract_;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-06
 * @author： xingxingzhao
 */
public class ShapeFactory extends AbstractFactory{

  @Override
  public Color getColor(String color) {
    return null;
  }

  //使用 getShape 方法获取形状类型的对象
  public Shape getShape(String shapeType){
    if(shapeType == null){
      return null;
    }
    if(shapeType.equalsIgnoreCase("CIRCLE")){
      return new Circle();
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
      return new Rectangle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
    }
    return null;
  }
}
