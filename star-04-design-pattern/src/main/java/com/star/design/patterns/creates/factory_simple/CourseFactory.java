package com.star.design.patterns.creates.factory_simple;

import com.star.design.patterns.creates.factory_method.ICourse;
import com.star.design.patterns.creates.factory_method.JavaCourse;
import com.star.design.patterns.creates.factory_method.PythonCourse;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class CourseFactory {

  public com.star.design.patterns.creates.factory_method.ICourse create(String courseName){

    if ("Java".equals(courseName)){
      return new JavaCourse();
    } else if ("Python".equals(courseName)){
      return new PythonCourse();
    } else {
      return null;
    }
  }

  public com.star.design.patterns.creates.factory_method.ICourse createForClassName(String className){

    try {
      //if (!(null == className || "".equals(className))){   原作者代码
      if (!Objects.isNull(className)){
        //java9 的写法
        return (com.star.design.patterns.creates.factory_method.ICourse) Class.forName(className).getDeclaredConstructor().newInstance();
      }
    } catch (Exception ex){
      ex.printStackTrace();
    }

    return null;
  }

  public com.star.design.patterns.creates.factory_method.ICourse createForClazz(Class<? extends ICourse> clazz){

    try {
      if (null != clazz){
        //java9 的写法
        return clazz.getDeclaredConstructor().newInstance();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return null;
  }

}
