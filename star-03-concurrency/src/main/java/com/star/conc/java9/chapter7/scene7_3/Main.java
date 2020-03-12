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
public class Main {

  public static void main(String[] args) {

    LinkedBlockingQueue queue = new LinkedBlockingQueue();

    Client client = new Client(queue);
    Thread thread = new Thread(client);
    thread.start();

    for (int i = 0 ; i < 3; i++){

      for (int j = 0 ; j < 5 ; j++){

        try {
          System.out.println("Main : removed :" + queue.take() + " ---size of queue :" + queue.size());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      try {
        TimeUnit.MILLISECONDS.sleep(4000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Main : end");
  }
}
