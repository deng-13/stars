package com.star.design.patterns.behavirous.chain.base;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-06
 * @author： xingxingzhao
 */
public class FileLogger extends AbstractLogger {

  public FileLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {

    System.out.println("File Console::Logger: " + message);
  }

}
