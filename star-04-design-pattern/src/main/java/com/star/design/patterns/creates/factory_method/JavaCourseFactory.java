package com.star.design.patterns.creates.factory_method;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class JavaCourseFactory implements ICourseFactory {

  @Override
  public ICourse create() {
    return new JavaCourse();
  }
}
