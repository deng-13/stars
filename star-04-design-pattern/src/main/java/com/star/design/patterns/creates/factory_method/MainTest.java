package com.star.design.patterns.creates.factory_method;

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

    ICourseFactory factory = new JavaCourseFactory();

    ICourse java = factory.create();
    java.record();

    factory = new PythonCourseFactory();
    ICourse python = factory.create();
    python.record();

  }
}

