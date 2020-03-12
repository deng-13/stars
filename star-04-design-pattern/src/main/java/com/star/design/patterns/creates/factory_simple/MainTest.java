package com.star.design.patterns.creates.factory_simple;

import com.star.design.patterns.creates.factory_method.ICourse;
import com.star.design.patterns.creates.factory_method.JavaCourse;
import com.star.design.patterns.creates.factory_method.PythonCourse;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public class MainTest {

  public static void main(String[] args) {

    // 创建方式1
//    CourseFactory course1 = new CourseFactory();
//    JavaVideo java1= (JavaVideo) course1.create("Java");
//    java1.record();
//
//    PythonVideo python1= (PythonVideo) course1.create("Python");
//    python1.record();

    // 创建方式2
    CourseFactory course2 = new CourseFactory();

//    JavaVideo java1 = (JavaVideo) course2
//        .createForClass("com.star.design.patterns.spring5.creates.factory_simple.JavaVideo");
    ICourse java2 = course2
        .createForClassName("com.star.design.patterns.spring5.creates.factory_simple.JavaVideo");
    java2.record();
    ICourse python2 = course2
        .createForClassName("com.star.design.patterns.spring5.creates.factory_simple.PythonVideo");
    python2.record();

    // 创建方式3
    CourseFactory course3 = new CourseFactory();
    ICourse java3 = course3.createForClazz(JavaCourse.class);
    java3.record();

    ICourse python3 = course3.createForClazz(PythonCourse.class);
    python3.record();


  }
}
