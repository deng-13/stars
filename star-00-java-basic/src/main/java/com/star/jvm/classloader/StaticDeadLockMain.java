package com.star.jvm.classloader;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-02-12
 * @author： xingxingzhao
 */
public class StaticDeadLockMain extends Thread{

  private char flag;

  public StaticDeadLockMain(char flag){

    this.flag =flag;
    this.setName("Thread" + flag);

  }

  @Override
  public void run(){

    try {
      System.out.println("ssssss");

      Class.forName("com.star.jvm.classloader.Static" + flag);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(getName() + "over");
  }

  public static void main(String[] args) {

    StaticDeadLockMain loadA = new StaticDeadLockMain('A');
    loadA.start();


    StaticDeadLockMain loadB = new StaticDeadLockMain('B');
    loadB.start();
  }


}
