package com.star.conc.wangwj.day1.chapter3;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class CreateThread3 {

  private static int count ;

  // 栈异常错误 java.lang.StackOverflowError
  public static void main(String[] args) {

    try {
      add(0);
      //} catch (Exception e){ //此处的 Exception 异常将不会 打印 count 的值，Error 可以
    } catch (Error e){
      e.printStackTrace();
      System.out.println(count);

    }
  }

  private static void add(int i ){
    count++;
    add(i+1);
  }
}
