package com.star.basic.classTest.extendsTest;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-28
 * @author： xingxingzhao
 */
public class ChildClass extends ParentClass{

  private Integer id;
  /**
   * 如果父类中只定义了有参数的构造方法，而在子类的构造方法中又没有用 super() 来调用父类中特定的构造方法，
   * 则编译时将发生错误，因为 Java 程序在父类中找不到没有参数的构造方法可供执行。
   *
   * 解决办法是在父类里加上一个不做事且没有参数的构造方法。
   */
  public ChildClass(Integer id) {
    super(id);
  }



}
