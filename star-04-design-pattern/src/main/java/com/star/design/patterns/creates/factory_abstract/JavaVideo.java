package com.star.design.patterns.creates.factory_abstract;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class JavaVideo implements IVideo {

  @Override
  public void record() {

    System.out.println( " 录制 Java 课程");
  }

}
