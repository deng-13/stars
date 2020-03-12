package com.star.basic.classTest.abstractClassTest;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-07
 * @author： xingxingzhao
 */
public class SubClassTest extends AbstractClassTest {

  @Override
  public void print() {
    System.out.println(" public void print()");
  }

  public static void main(String[] args) {

    SubClassTest test = new SubClassTest();
    test.print();
    test.printA();
  }
}
