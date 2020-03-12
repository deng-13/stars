package com.star.design.patterns.behavirous.template.demo1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public abstract class HummerModel {

  public abstract void start();

  public abstract void stop();

  public abstract void alarm();

  public abstract void engineBoom();

  public final void run() {

    this.start();
    this.engineBoom();
    this.alarm();
    this.stop();
  }

}
