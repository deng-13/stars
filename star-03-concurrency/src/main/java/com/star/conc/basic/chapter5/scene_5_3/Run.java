package com.star.conc.basic.chapter5.scene_5_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Run {

  public static void main(String[] args) {


    try{
      Runnable runnable = new Runnable() {
        @Override
        public void run() {
          System.out.println("打印的信息");
        }
      };

      ExecutorService executorService = Executors.newFixedThreadPool(1);

      // submit() 参数传入 runnable 无返回值，方法 future.get() 有阻塞特性，future.isDone() 无阻塞特性
      Future future = executorService.submit(runnable);

      System.out.println(future.get() + " " + future.isDone());
    } catch (Exception e){

    }
  }
}
