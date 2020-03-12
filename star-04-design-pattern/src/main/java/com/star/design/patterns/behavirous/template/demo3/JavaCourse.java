package com.star.design.patterns.behavirous.template.demo3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class JavaCourse extends NetworkCourse {

  @Override
  public void createPPT() {
    System.out.println(" 创建 ppt");
  }

  @Override
  public void postSource() {
    System.out.println(" 提交源码");
  }

  @Override
  public void postNote() {
    System.out.println(" 提交笔记");
  }

  @Override
  public void liveVideo() {
    System.out.println(" 视频直播");
  }
}
