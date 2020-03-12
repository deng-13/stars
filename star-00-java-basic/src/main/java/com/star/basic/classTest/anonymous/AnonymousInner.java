package com.star.basic.classTest.anonymous;

/**
 * 1. 匿名内部类
 *
 *
 * 当通过接口来创建匿名内部类时，匿名内部类不能显示创建构造器，因此匿名内部类里只有一个隐式的无参构造器，故new接口名后的括号里不能传入参数值。
 *
 * 如果通过继承父类来创建匿名内部类时，匿名内部类将拥有和父类相似的构造器，此处的相似指的是拥有相同的形参列表。
 */
abstract class Device
{
  private String name;
  public abstract double getPrice();
  public Device(){}
  public Device(String name)
  {
    this.name = name;
  }
  // 此处省略了name的setter和getter方法
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return this.name;
  }
}
public class AnonymousInner {

  public void test(Device d) {
    System.out.println("购买了一个 " + d.getName()
        + " ，花掉了" + d.getPrice());
  }

  public static void main(String[] args) {
    AnonymousInner ai = new AnonymousInner();
    // 调用有参数的构造器创建Device匿名实现类的对象
    ai.test(new Device("电子示波器") {
      public double getPrice() {
        return 67.8;
      }
    });
    // 调用无参数的构造器创建Device匿名实现类的对象
    ai.test(new Device() {
      // 初始化块
      {
        System.out.println("匿名内部类的初始化块...");
      }

      // 实现抽象方法
      public double getPrice() {
        return 56.2;
      }

      // 重写父类的实例方法
      public String getName() {
        return "键盘";
      }
    });
  }
}