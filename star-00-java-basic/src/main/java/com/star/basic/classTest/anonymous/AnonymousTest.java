package com.star.basic.classTest.anonymous;


/**
 * 2. 匿名内部类
 */
interface Product
{
  double getPrice();
  String getName();
}
public class AnonymousTest
{
  public void test(Product p)
  {
    System.out.println("购买了一个" + p.getName()
        + "，花掉了" + p.getPrice());
  }
  public static void main(String[] args)
  {
    AnonymousTest ta = new AnonymousTest();
    // 调用test()方法时，需要传入一个Product参数，
    // 此处传入其匿名内部类的实例
    ta.test(new Product()
    {
      public double getPrice()
      {
        return 567.8;
      }
      public String getName()
      {
        return "AGP显卡";
      }
    });
  }
}