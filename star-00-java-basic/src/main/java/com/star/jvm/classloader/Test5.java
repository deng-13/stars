package com.star.jvm.classloader;

/**
 * <p>
 *  当一个接口在初始化时，并不要求它的父类也完成初始化
 *  只有真的使用到 父接口的时候（如引用接口中多定义的常量时）。才会完成父接口的初始化
 *
 *  注意，接口中定义的类变量 本身就是一个常量
 * </p>
 *
 * @created： 2020-02-14
 * @author： xingxingzhao
 */
public class Test5 {

  public static void main(String[] args) {

    System.out.println(Child5.j);
  }
}

interface Parent5{

  public static int i = 5;

}

interface Child5 extends Parent5{

  public static int j = 4;
}
