package com.star.jvm.basic;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * -Xmx20m -XX:+PrintGCDetails -verbose:gc
 * </p>
 *
 * @created： 2020-02-16
 * @author： xingxingzhao
 */
public class Demo2_3 {

  private static final int _4MB = 1024 * 1024 * 4;

  public static void main(String[] args) {

    List<WeakReference<byte[]>> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {

      WeakReference<byte[]> ref = new WeakReference<>(new byte[_4MB]);

      for (WeakReference<byte[]> reference : list) {
        System.out.println(reference.get() + "" );
      }
      System.out.println(ref.get());
      list.add(ref);
      System.out.println(list.size());
    }


  }

}
