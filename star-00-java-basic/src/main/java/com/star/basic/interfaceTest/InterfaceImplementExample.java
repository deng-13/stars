package com.star.basic.interfaceTest;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-07
 * @author： xingxingzhao
 */
public class InterfaceImplementExample implements InterfaceExample {

  @Override
  public void func1() {
    System.out.println("func1");
  }

  public static void main(String[] args) {

    InterfaceExample ie2 = new InterfaceImplementExample();
    ie2.func1();
    ie2.func2();
    System.out.println(InterfaceExample.x);
    System.out.println(InterfaceExample.z);
  }
}
