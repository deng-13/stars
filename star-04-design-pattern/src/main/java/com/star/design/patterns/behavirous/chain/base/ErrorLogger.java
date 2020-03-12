package com.star.design.patterns.behavirous.chain.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-06
 * @author： xingxingzhao
 */
public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {

    System.out.println("Error Console::Logger: " + message);
  }
}
