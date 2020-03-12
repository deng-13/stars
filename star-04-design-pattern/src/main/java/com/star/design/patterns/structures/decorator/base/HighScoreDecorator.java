package com.star.design.patterns.structures.decorator.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class HighScoreDecorator extends Decorator {

  public HighScoreDecorator(SchoolReport sr) {
    super(sr);
  }

  public void reportHighScore(){

    System.out.println(" 每科的最高成绩是 。。。。。");
  }

  @Override
  public void report(){
    this.reportHighScore();
    super.report();
  }
}
