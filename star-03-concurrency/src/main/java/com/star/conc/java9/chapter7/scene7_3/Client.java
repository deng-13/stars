package com.star.conc.java9.chapter7.scene7_3;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-09
 * @author： xingxingzhao
 */
public class Client implements Runnable {

  private final LinkedBlockingQueue<String> queue;

  public Client(LinkedBlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 5; j++) {

        try {
          queue.put("i:" + j + "-j:" + j);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }

      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("client add operate end");
  }
}
