package com.star.jvm.classloader;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-14
 * @author： xingxingzhao
 */
public class Test6 {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    System.out.println(Singleton.count);
    System.out.println(Singleton.count1);

  }
}

class Singleton{

  public static int count ; //在类加载期间设置为 初始值 = 0
  private static Singleton singleton = new Singleton();

  private Singleton(){
    count++;
    count1++;
    System.out.println(count); // 输出为 1
    System.out.println(count1);// 输出为 1
  }

  // 该语句会覆盖掉 构造器中的 count1++ -> 1 的值，重新设置为0
  public static int count1 = 0 ;

  public static Singleton getInstance(){
    return singleton;
  }
}