package com.star.basic.stringTest;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-07
 * @author： xingxingzhao
 */
public class StringPoolTest {

  public static void main(String[] args) {
    //s1 和 s2 采用 new String() 的方式新建了两个不同字符串，而 s3 和 s4 是通过 s1.intern() 方法取得同一个字符串引用。
    //intern() 首先把 s1 引用的字符串放到 String Pool 中，然后返回这个字符串引用。因此 s3 和 s4 引用的是同一个字符串。
    String s1 = new String("aaa");
    String s2 = new String("aaa");
    System.out.println(s1 == s2);           // false
    String s3 = s1.intern();
    String s4 = s1.intern();
    System.out.println(s3 == s4); // true

    String s5 = "bbb";
    String s6 = "bbb";
    System.out.println(s5 == s6);  // true
  }
}
