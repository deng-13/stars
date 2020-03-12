package com.star.design.patterns.creates.factory_abstract;

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
  public IVideo createVideo() {
    return new JavaVideo();
  }

  @Override
  public INote createNote() {
    return new JavaNote();
  }
}
