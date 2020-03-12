package com.star.conc.wangwj.day1.chapter2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class TicketWindowRunnable implements Runnable  {

  //添加 static ，让变量初始化一次
  private final static int MAX = 50;

  private AtomicInteger index = new AtomicInteger(1);

  @Override
  public void run() {
    while (index.intValue() <= MAX){
      System.out.println(Thread.currentThread().getName() + ":当前号码是" + (index.getAndIncrement()));
    }
    // currentIndex();
  }

//  private synchronized void  currentIndex(){
//    while (index <= MAX){
//      System.out.println(Thread.currentThread().getName() + ":当前号码是" + (index++));
//    }
//  }
}
