package com.star.conc.java9.chapter7.scene7_2;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-09
 * @author： xingxingzhao
 */
public class PollTask implements Runnable {

  private ConcurrentLinkedDeque list;

  public PollTask(ConcurrentLinkedDeque list) {
    this.list = list;
  }

  @Override
  public void run() {

    for (int i = 0 ; i < 5000; i++){
      list.pollFirst();
      list.pollLast();
    }
  }
}
