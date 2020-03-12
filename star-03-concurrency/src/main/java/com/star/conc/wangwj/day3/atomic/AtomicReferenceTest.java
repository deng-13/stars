package com.star.conc.wangwj.day3.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-10
 * @author： xingxingzhao
 */
public class AtomicReferenceTest {

  public static void main(String[] args) {

    AtomicReference<Simple> atomicReference = new AtomicReference<Simple>(new Simple("test", 21));

    System.out.println(atomicReference.get());

    boolean result = atomicReference.compareAndSet(new Simple("sdd", 12), new Simple("wee", 33));
    System.out.println(result);
  }

  static class Simple{

    private String name;
    private int age;

    public Simple(String name, int age) {
      this.name = name;
      this.age = age;
    }


  }
}

