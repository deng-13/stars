package com.star.conc.basic.chapter6.scene_6_2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-02
 * @author： xingxingzhao
 */
public class Test2 {

  public static void main(String[] args) {

    try {

      MyCallable callable1 = new MyCallable("name1", 3000);
      MyCallable callable2 = new MyCallable("name2", 4000);
      MyCallable callable3 = new MyCallable("name3", 6000);
      MyCallable callable4 = new MyCallable("name4", 2000);
      MyCallable callable5 = new MyCallable("name5", 4000);
      MyCallable callable6 = new MyCallable("name6", 1000);
      MyCallable callable7 = new MyCallable("name7", 3000);

      List<Callable> callableList = new ArrayList<>();
      callableList.add(callable1);
      callableList.add(callable2);
      callableList.add(callable3);
      callableList.add(callable4);
      callableList.add(callable5);
      callableList.add(callable6);
      callableList.add(callable7);

      ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS,
          new LinkedBlockingDeque<>());

      CompletionService completionService = new ExecutorCompletionService(executor);

      for (int i = 0 ; i < 7; i++){

        completionService.submit(callableList.get(i));
      }


      // 循环次数变成了 8 ，当进行第8次的时候，由于当前没有任务被执行完，completionService.take().get() 呈阻塞状态
      for (int i = 0; i < 8; i++){

        System.out.println("等待打印第 " + (i + 1) + " 个返回值");
        System.out.println(completionService.take().get());
      }

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }


  }

}
