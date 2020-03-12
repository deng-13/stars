package com.star.design.patterns.creates.factory_simple;

import com.star.design.patterns.creates.factory_method.ICourse;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class PythonCourse implements ICourse {

  @Override
  public void record() {

    System.out.println(" 录制 python 课程 ");
  }
}
