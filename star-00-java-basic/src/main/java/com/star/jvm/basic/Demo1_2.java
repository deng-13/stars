package com.star.jvm.basic;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_2 {

  private static int count ;
  public static void main(String[] args) {

    try{
      method1();
    } catch (Throwable e){
      e.printStackTrace();
      System.out.println(count);
    }
  }

  private static void method1(){
    count++;
    method1();
  }
}
