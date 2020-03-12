package com.star.conc.java9.chapter7.scene7_4;

import java.util.concurrent.PriorityBlockingQueue;

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

    PriorityBlockingQueue queue = new PriorityBlockingQueue();
    Thread[] threads = new Thread[5];

    for (int i = 0; i < threads.length; i++) {

      Task task = new Task(i, queue);
      threads[i] = new Thread(task);
      threads[i].start();
    }

    for (int i = 0; i < threads.length; i++) {

      try {
        threads[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }

    for (int i = 0; i < threads.length * 1000; i++) {

      Event event = (Event) queue.poll();

      System.out.println("Thread id :" + event.getThread() + "priority is " + event.getPriority());
    }
  }
}
