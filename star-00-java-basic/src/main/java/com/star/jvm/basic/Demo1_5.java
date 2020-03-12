package com.star.jvm.basic;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * <p>
 *
 * 演示元空间内存溢出
 *
 * -XX:MaxMetaspaceSize=8m
 * </p>
 *
 * @created： 2020-02-15
 * @author： xingxingzhao
 */
public class Demo1_5 extends ClassLoader{

  public static void main(String[] args) {
    int j = 0;
    try {
      Demo1_5 demo = new Demo1_5();

      for (int i = 0; i < 100000; i++, j++) {

        ClassWriter classWriter = new ClassWriter(0);

        classWriter
            .visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
        byte[] bytes = classWriter.toByteArray();

        demo.defineClass("Class" + i, bytes, 0 , bytes.length);

      }

    } finally {
      System.out.println(j);
    }
  }
}
