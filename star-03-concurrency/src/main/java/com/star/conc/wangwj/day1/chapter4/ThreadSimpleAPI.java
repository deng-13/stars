package com.star.conc.wangwj.day1.chapter4;

import java.util.Optional;
import javax.swing.text.html.Option;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class ThreadSimpleAPI {

  public static void main(String[] args) {

    Thread thread = new Thread(() ->{

      try{
        Thread.sleep(1000);
      } catch (Exception e){
         e.printStackTrace();
      }
    }, "t1");

    thread.start();
    thread.setPriority(Thread.MAX_PRIORITY);
    thread.setPriority(Thread.NORM_PRIORITY);
    thread.setPriority(Thread.MIN_PRIORITY);
    System.out.println( thread.getName() );
    System.out.println( thread.getId());
    System.out.println(thread.getPriority());
  }
}
