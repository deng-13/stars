package com.star.design.patterns.structures.decorator.mybatis;


/**
 * <p>
 * 装饰模式和代理模式 对比
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public interface Cache {

  String getId();

  Object getObject(Object key);

  void putObject(Object key, Object value);

  Object removeObject(Object key);

  void clear();

  int getSize();

}
