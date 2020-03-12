package com.star.jvm.classloader;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-14
 * @author： xingxingzhao
 */
public class Test7 {

  public static void main(String[] args) throws ClassNotFoundException {

    Class tClass = Class.forName("java.lang.String");
    System.out.println(tClass.getClassLoader());   //null

    Class aClass = Class.forName("com.star.jvm.classloader.Demo");
    System.out.println(aClass.getClassLoader());  //sun.misc.Launcher$AppClassLoader@18b4aac2

  }
}

class Demo{

}
