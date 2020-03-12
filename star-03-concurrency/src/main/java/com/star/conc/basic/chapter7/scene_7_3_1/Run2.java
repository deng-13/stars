package com.star.conc.basic.chapter7.scene_7_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run2 {

  public static void main(String[] args) {
    try {

      List list = new ArrayList();
      list.add(new MyCallableA());
      list.add(new MyCallableB2());

      ExecutorService executorService = Executors.newCachedThreadPool();

      String getValueA= (String) executorService.invokeAny(list);

      System.out.println("=====" + getValueA);

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
