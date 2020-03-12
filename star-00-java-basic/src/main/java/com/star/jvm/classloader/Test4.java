package com.star.jvm.classloader;

/**
 * <p>
 * 对于数组来说，它的类型是由 JVM 在运行期间动态生成的，表示为[Lcom/star/jvm/classloader/Parent4
 *
 * 助记符：
 *  anewarray：表示创建一个引用类型（类，接口，数组）的数组，并将其压入栈顶
 *  newarray： 表示创建一个原始类型的数组，并将其引用值压入栈顶
 * </p>
 *
 * @created： 2020-02-14
 * @author： xingxingzhao
 */
public class Test4 {

  public static void main(String[] args) {
//    Parent4 parent4 = new Parent4();
//    Parent4 parent5 = new Parent4();

    Parent4[] parent4s = new Parent4[1];
    System.out.println(parent4s.getClass());

    Parent4[][] parent4Arr = new Parent4[1][];
    System.out.println(parent4Arr.getClass());

    System.out.println("e------------");
    int[] i = new int[2];
    System.out.println(i.getClass());
    System.out.println(i.getClass().getSuperclass());
  }


}

class Parent4{

  static {
    System.out.println("Parent4 static block is printed");
  }
}
