package com.star.conc.basic.chapter9.scene_9_3;

import java.util.concurrent.RecursiveAction;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-03
 * @author： xingxingzhao
 */
public class MyRecursiveAction extends RecursiveAction {

  private int beginValue;
  private int endValue;

  public MyRecursiveAction(int beginValue, int endValue) {
    super();
    this.beginValue = beginValue;
    this.endValue = endValue;
  }

  @Override
  protected void compute() {
    System.out.println("compute on ....");

    System.out.println(Thread.currentThread().getName());
    if (endValue - beginValue > 2){
       int midNum = (beginValue + endValue)/2;
       MyRecursiveAction leftAction = new MyRecursiveAction(beginValue, midNum);
       MyRecursiveAction rightAction = new MyRecursiveAction(midNum + 1, endValue);

       this.invoke();
    } else {
      System.out.println("结果为：" + beginValue + "-" + endValue);
    }
  }
}
