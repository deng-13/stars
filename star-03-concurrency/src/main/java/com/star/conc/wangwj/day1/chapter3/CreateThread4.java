package com.star.conc.wangwj.day1.chapter3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class CreateThread4 {

  private static int count;
  public static void main(String[] args) {

    Thread thread = new Thread(null,new Runnable() {
      @Override
      public void run() {

        try {
          add(0);
        } catch (Error e){

          e.printStackTrace();
          System.out.println(count);
        }
      }

      private void add(int i ){
        count++;
        add(i + 1);
      }
    },"Test",  1 << 24);
    thread.start();
  }
}
