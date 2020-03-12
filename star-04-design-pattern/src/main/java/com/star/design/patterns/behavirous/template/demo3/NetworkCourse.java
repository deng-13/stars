package com.star.design.patterns.behavirous.template.demo3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public abstract class NetworkCourse {

  public abstract void createPPT();

  public abstract void postSource();

  public abstract void postNote();

  public abstract void liveVideo();

  public final void createCourse() {

    this.createPPT();
    this.liveVideo();
    this.postNote();
    this.postSource();
  }
}
