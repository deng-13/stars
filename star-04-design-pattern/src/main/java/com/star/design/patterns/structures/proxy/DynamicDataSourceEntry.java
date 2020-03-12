package com.star.design.patterns.structures.proxy;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-10
 * @author： xingxingzhao
 */
public class DynamicDataSourceEntry {

  private final static String DEFAULT_SOURCE = null;

  private final static ThreadLocal<String> local = new ThreadLocal();

  private DynamicDataSourceEntry(){};

  public static void clear(){

    local.remove();
  }

  public static String getSource(){

    return local.get();
  }

  public static void restore(){

    local.set(DEFAULT_SOURCE);
  }

  public static void set(String source){

    local.set(source);
  }

  public static void set(int year){
    local.set("DB_" + year);
  }
}
