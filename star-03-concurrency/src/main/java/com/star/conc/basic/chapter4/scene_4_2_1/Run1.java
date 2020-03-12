package com.star.conc.basic.chapter4.scene_4_2_1;

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
public class Run1 {

  public static void main(String[] args) {

    //创建无界限线程池
    ExecutorService executorService = Executors.newCachedThreadPool();

    executorService.execute(new Runnable() {
      @Override
      public void run() {

        try {

          System.out.println(" Runnable1 is beginning");

          Thread.sleep(3000);
          System.out.println("A");
          System.out.println(" Runnable1 is end");

        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    });

    executorService.execute(new Runnable() {
      @Override
      public void run() {

        try {

          System.out.println(" Runnable2 is beginning");

          Thread.sleep(3000);
          System.out.println("B");
          System.out.println(" Runnable2 is end");

        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    });

  }


}
