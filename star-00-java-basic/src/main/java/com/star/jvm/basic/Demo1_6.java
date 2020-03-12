package com.star.jvm.basic;

/**
 * <p>
 * -Xmx10m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails -verbose:gc
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_6 {

  public static void main(String[] args) {

    int i = 0;

    try {

      for (int j = 0 ; j < 20000; i++, j++){

        String.valueOf(j).intern();

      }
    } catch ( Throwable e){
    }
  }

}
