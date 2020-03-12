package com.star.conc.basic.chapter9.scene_9_2;

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

  @Override
  protected void compute() {
    System.out.println("compute on ....");
  }
}
