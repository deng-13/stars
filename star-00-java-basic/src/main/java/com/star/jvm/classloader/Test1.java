package com.star.jvm.classloader;

/**
 * <p>
 *  对于静态字段来说，只有直接定义了 该字段的类才会初始化（final 修饰的静态字段除外）
 *  当一个子类在初始化时，要求其父类已经初始化完毕。
 * </p>
 *
 * <p>
 *   常量在编译阶段会存入调用这个常量的方法所在的类的常量池中
 *   本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量类的初始化
 *
 *   这里是指，将 Parent 定义的常量 存放在Test1之后，Test1 就和 Parent 没有任何关系了
 *   甚至，可以将 Parent 的class文件删除
 *
 *   助记符：
 *    ldc： 用于将int、float、String类型常量从常量池中压到栈顶，在这段范围（-2147483648~2147483647）内的int值存储在常量池中。
 *    bipush： 取值-128~127，
 *    sipush： 取值-32768~32767
 *    iconst_0、iconst_1、iconst_2、iconst_3、iconst_4、iconst_5： 当int取值0~5时
 *    iconst_m1： 当int取值-1
 * </p>
 *
 * @created： 2020-02-12
 * @author： xingxingzhao
 */
public class Test1 {

  public static void main(String[] args) {

    System.out.println(Parent.i);
  }
}

class Parent{

  //public static String str = "hello world";
  public final static String str = "hello world";
  public final static Object obj = null;
  public final static int i = -1;

  static {

    System.out.println(" parent info sysout");
  }

}

class Child extends Parent{

  //public static String str = "welcome";
  public final static String str = "welcome";

  static {
    System.out.println(" child info sysout");
  }
}