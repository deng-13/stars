package com.star.jvm.basic;

/**
 * <p>
 * 演示堆内存分配
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_4 {

  public static void main(String[] args) throws InterruptedException {

    System.out.println("1--------");
    Thread.sleep(30000);
    byte[] array = new byte[1024*1024*20];
    System.out.println("2--------");
    Thread.sleep(20000);
    array = null;
    System.gc();

    Thread.sleep(30000);
    System.out.println("3--------");
  }
}
