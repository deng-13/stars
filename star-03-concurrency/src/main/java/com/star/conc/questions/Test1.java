package com.star.conc.questions;

/**
 * <p>
 * 子线程循环2次，主线程循环2次，然后子线程循环2次，主线程循环2次，这样循环10次；
 * </p>
 *
 * @created： 2020-01-09
 * @author： xingxingzhao
 */
public class Test1 {
  static class Mywork {
    private volatile boolean flag=true;//代表是否等待
    private synchronized void sub(){
      while (! flag){
        try {
          this.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      for (int i = 0; i < 2; i++) {
        System.out.println("sub run "+ i);
      }
      flag=false;
      this.notify();
    }
    private synchronized void mainRun(){
      while (flag){
        try {
          this.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      for (int i = 0; i < 2; i++) {
        System.out.println("main run----------- "+i);
      }
      flag=true;
      this.notify();
    }
  }
  public static void main(String[] args) {
    Mywork mywork=new Mywork();
    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          mywork.sub();
        }
      }
    }).start();

    for (int i = 0; i < 10; i++) {
      mywork.mainRun();
    }
  }
}