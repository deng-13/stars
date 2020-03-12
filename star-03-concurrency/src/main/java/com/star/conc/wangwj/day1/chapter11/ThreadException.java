package com.star.conc.wangwj.day1.chapter11;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-08
 * @author： xingxingzhao
 */
public class ThreadException {

  private static int a = 1000;
  private static int b = 0;

  public static void main(String[] args) {

    // 无法在 run 之外打印出 线程的异常信息，可以通过  setUncaughtExceptionHandler 重新捕获后，并输出
    Thread t = new Thread() {
      @Override
      public void run() {
          int c = a / b;
          System.out.println(c);

      }
    };
    t.start();
    t.setUncaughtExceptionHandler((thread, e) -> {
      System.out.println(thread);
      System.out.println(e);
    });
  }
}
