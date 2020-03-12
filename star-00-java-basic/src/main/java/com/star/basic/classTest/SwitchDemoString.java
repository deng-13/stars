package com.star.basic.classTest;

/**
 * <p>
 * 查看 string  hashcode
 * </p>
 *
 * @created： 2019-12-27
 * @author： xingxingzhao
 */
public class SwitchDemoString {

  public static void main(String[] args) {
    String str = "world";
    switch (str) {
      case "hello":
        System.out.println("hello");
        break;
      case "world":
        System.out.println("world");
        break;
      default:
        break;
    }
  }
}
