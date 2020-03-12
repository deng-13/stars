package com.star.conc.wangwj.day1.chapter1;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-07
 * @author： xingxingzhao
 */
public class TestMain {

  public static void main(String[] args) {

    TemplateMethod templateMethod = new TemplateMethod(){

      @Override
      protected void printInfo(String str) {
        super.printInfo("---" + str + "---" );
      }
    };

    templateMethod.printInfo("sdjfl");
  }
}
