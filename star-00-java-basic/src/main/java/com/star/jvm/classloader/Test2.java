package com.star.jvm.classloader;

/**
 * @created： 2020-02-12
 * @author： xingxingzhao
 */
public class Test2 {

  public static void main(String[] args) {
    System.out.println(Child2.str); //去掉 str 变量，则child2 不会被初始化，此时number = 4 ；
                                    // 当child2 被初始化后，静态代码块会重写 number的值。修改为 2
    System.out.println(Child2.number);
  }
}

class Parent2{

  public static int i = 0;
  public static int number;

  static {
    number = 4;
  }

}

class Child2 extends Parent2{

  public static String str = "hello";
  static {
    number = 2;
  }

  // main 方法是初始化的入口，会直接调用 静态代码块，将number 重制为 2
//  public static void main(String[] args) {
//    System.out.println(number);
//  }
}