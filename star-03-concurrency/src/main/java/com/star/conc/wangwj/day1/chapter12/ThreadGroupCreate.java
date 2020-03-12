package com.star.conc.wangwj.day1.chapter12;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ThreadGroupCreate {

  public static void main(String[] args) {

    ThreadGroup tg1 = new ThreadGroup("tg1");

    Thread thread1 = new Thread(tg1,"t1"){

      @Override
      public void run() {
        while (true){
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
//          System.out.println(getThreadGroup().getName());
//          System.out.println(getThreadGroup().getParent().getName());

        }
      }
    };
    thread1.start();

    ThreadGroup tg2 = new ThreadGroup(tg1,"tg2");
    Thread thread2 = new Thread(tg2,"t2"){

      @Override
      public void run() {
        while (true){
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
//          System.out.println(getThreadGroup().getName());
//          System.out.println(getThreadGroup().getParent().getName());

        }
      }
    };
    thread2.start();

    tg2.interrupt();
    System.out.println(tg1.isDestroyed());
//    System.out.println(tg1.activeCount());
//    System.out.println(tg1.activeGroupCount());
//    System.out.println(tg2.activeCount());
  }
}
