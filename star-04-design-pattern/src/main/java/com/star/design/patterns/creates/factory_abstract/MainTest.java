package com.star.design.patterns.creates.factory_abstract;

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

    IVideo javaVideo = factory.createVideo();
    INote javaNote = factory.createNote();
    javaVideo.record();
    javaNote.note();

    factory = new PythonCourseFactory();
    IVideo pythonVideo = factory.createVideo();
    INote pythonNote = factory.createNote();
    pythonVideo.record();
    pythonNote.note();

  }
}

