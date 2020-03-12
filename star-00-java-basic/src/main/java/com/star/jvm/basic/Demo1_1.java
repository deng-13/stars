package com.star.jvm.basic;

/**
 * <p>
 * 成员方法中，局部变量逃逸问题
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_1 {

  public static void main(String[] args) {

    int i = 3;
    while (i > 0){
      new Thread(){

        public void run(){
          method1();
        }
      }.start();
      i--;
    }

    System.out.println("-----------------------");

    i = 3;
    StringBuilder sb = new StringBuilder();
    while (i > 0){
      new Thread(){

        public void run(){
          method2(sb);
        }
      }.start();
      i--;
    }

    System.out.println("-----------------------");

    i = 1000;
    while (i > 0){
      new Thread(){

        public void run(){
          System.out.println(method4());

        }
      }.start();
      i--;
    }

  }

  /**
   * 线程安全
   */
  public static void method1(){

    StringBuilder sb = new StringBuilder();
    sb.append(1);
    sb.append(2);
    sb.append(3);
    sb.append(4);

    System.out.println(sb.toString());
  }

  /**
   * 线程不安全的
   * @param sb
   */
  public static void method2(StringBuilder sb){

    sb.append(1);
    sb.append(2);
    sb.append(3);
    sb.append(4);

    System.out.println(sb.toString());
  }

  /**
   * 线程安全的
   * @return
   */
  public static String method3(){

    StringBuilder sb = new StringBuilder();
    sb.append(1);
    sb.append(2);
    sb.append(3);
    sb.append(4);

    return sb.toString();
  }

  public static String method4(){
    return method3();
  }
}
