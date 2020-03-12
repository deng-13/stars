package com.star.conc.wangwj.day1.chapter6;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class TestForce {

  public static void main(String[] args) {

    ThreadForceClose forceClose = new ThreadForceClose();

    long start = System.currentTimeMillis();

    forceClose.execute(() ->{

//      while (true){
//
//      }

      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    forceClose.shutDown(10000);

    long end = System.currentTimeMillis();
    System.out.println( end -start);
  }
}
