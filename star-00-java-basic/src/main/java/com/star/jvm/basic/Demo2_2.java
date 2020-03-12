package com.star.jvm.basic;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
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
public class Demo2_2 {

  private static final int _4MB = 1024 * 1024 * 4;

  public static void main(String[] args) {

    List<SoftReference<byte[]>> list = new ArrayList<>();

    ReferenceQueue<byte[]> queue = new ReferenceQueue<>();
    for (int i = 0; i < 5; i++) {

      SoftReference<byte[]> ref = new SoftReference<>(new byte[_4MB], queue);

      System.out.println(ref.get());
      list.add(ref);
      System.out.println(list.size());
    }

    Reference<? extends byte[]> poll = queue.poll();
    while (poll != null) {

      list.remove(poll);
      poll = queue.poll();
    }

    for (SoftReference<byte[]> reference : list) {
      System.out.println(reference.get());
    }
  }

}
