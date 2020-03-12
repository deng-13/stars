package com.star.design.patterns.creates.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-08
 * @author： xingxingzhao
 */
public enum EnumSingleton {

  ENUM_SINGLETON;
  private Object data;

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static EnumSingleton getInstance(){
    return ENUM_SINGLETON;
  }
}
