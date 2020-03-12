package com.star.jvm.classloader;

import java.util.Random;
import java.util.UUID;

/**
 * <p>
 * 当一个常量的值 并非编译期间可以确定的化，那么其值 也就不会被放到调用类的常量池中
 * 这个时候在程序运行时，会导致主动使用这个常量所在的类，从而会导致这个类被初始化
 * </p>
 *
 * @created： 2020-02-14
 * @author： xingxingzhao
 */
public class Test3 {

  public static void main(String[] args) {
    //System.out.println(Parent3.i);
    System.out.println(Parent3.str);
  }
}

class Parent3{

  public final static int i = new Random().nextInt();
  public final static String str = UUID.randomUUID().toString();

  static {
    System.out.println("Parent3 class static block is printed");
  }

}