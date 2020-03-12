package com.star.design.patterns.creates.factory_abstract;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public interface ICourseFactory {

  IVideo createVideo();

  INote createNote();
}
