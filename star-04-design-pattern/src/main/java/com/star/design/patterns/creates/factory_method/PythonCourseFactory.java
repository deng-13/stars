package com.star.design.patterns.creates.factory_method;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class PythonCourseFactory implements ICourseFactory {

  @Override
  public ICourse create() {
    return new PythonCourse();
  }
}
