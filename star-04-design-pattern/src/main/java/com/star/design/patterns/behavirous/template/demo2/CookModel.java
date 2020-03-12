package com.star.design.patterns.behavirous.template.demo2;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public abstract class CookModel {

  public abstract void zhaicai();
  public abstract void xicai();
  public abstract void caocai();
  public abstract void zhuangpan();

  public final void cooking(){

    this.zhaicai();
    this.xicai();
    this.caocai();
    this.zhuangpan();
  }
}
