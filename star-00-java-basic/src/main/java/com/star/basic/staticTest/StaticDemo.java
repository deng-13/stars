package com.star.basic.staticTest;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-30
 * @author： xingxingzhao
 */
public class StaticDemo {

  private static Integer staticVar = 1;
  private  Integer var = 2;

  static {

    System.out.println("A");
  }

  static class InnerClass {

    static {
      System.out.println("InnerClass");
    }
    public void print(String test){
      System.out.println("InnerClass param is " + test);
    }
  }

  class InnerClass1 {

    public void print(String test){
      System.out.println("InnerClass1 param is " + test);
    }
  }

  public static void testStaticFun(){
    System.out.println("B");
  }

  public static void main(String[] args) {

    String a = "f";
    StaticDemo staticDemo = new StaticDemo();
    InnerClass1 class1 = staticDemo.new InnerClass1();
    class1.print("ok");


    InnerClass innerClass = new InnerClass();
    innerClass.print("fail");

    System.out.println( "C");
    testStaticFun();
    System.out.println(staticVar);
    System.out.println(new StaticDemo().var);
  }
}


