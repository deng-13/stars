package com.star.design.patterns.structures.decorator.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public abstract class Decorator extends SchoolReport {

  private SchoolReport sr;

  public Decorator(SchoolReport sr) {
    this.sr = sr;
  }

  public void report() {
    this.sr.report();
  }

  public void sign() {

    this.sr.sign();
  }
}
