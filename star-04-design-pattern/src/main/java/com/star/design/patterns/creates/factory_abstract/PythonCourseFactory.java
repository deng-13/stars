package com.star.design.patterns.creates.factory_abstract;

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
  public IVideo createVideo() {
    return new PythonVideo();
  }

  @Override
  public INote createNote() {
    return new PythonNote();
  }
}
