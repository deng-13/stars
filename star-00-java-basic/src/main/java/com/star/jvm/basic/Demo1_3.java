package com.star.jvm.basic;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_3 {

  public static void main(String[] args) {

    int i =0 ;
    try {
      String str = "hello";
      while (true) {

        str = str + str;
        i++;
      }
    } catch (Throwable a){
      a.printStackTrace();
      System.out.println(i);
    }
  }
}
