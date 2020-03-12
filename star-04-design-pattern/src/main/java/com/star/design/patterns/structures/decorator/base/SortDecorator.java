package com.star.design.patterns.structures.decorator.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class SortDecorator extends Decorator {

  public SortDecorator(SchoolReport sr) {
    super(sr);
  }

  public void reportSort(){

    System.out.println(" 我的班级排名是 30 名");
  }

  public void report(){
    this.reportSort();
    super.report();
  }
}
