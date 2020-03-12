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
public class Main {

  public static void main(String[] args) {

    ConcurrentLinkedDeque list = new ConcurrentLinkedDeque();

    Thread[] threads = new Thread[100];
    for (int i = 0 ; i < threads.length ; i++){

      AddTask addTask = new AddTask(list);
      threads[i] = new Thread(addTask);
      threads[i].start();
    }

    System.out.println("Main : AddTask threads length is :" + threads.length);

    for (int i = 0 ; i < threads.length ; i++){
      try {
        threads[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Main : AddTask size of list is :" + list.size());


    for (int i =0 ; i < threads.length ; i++){
      PollTask pollTask = new PollTask(list);

      threads[i] = new Thread(pollTask);
      threads[i].start();
    }

    System.out.println("Main : PollTask threads length is :" + threads.length);

    for (int i = 0 ; i < threads.length ; i++){
      try {
        threads[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Main : size of list is :" + list.size());



  }
}
