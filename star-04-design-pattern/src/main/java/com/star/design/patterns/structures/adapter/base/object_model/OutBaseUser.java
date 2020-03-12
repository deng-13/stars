package com.star.design.patterns.structures.adapter.base.object_model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public class OutBaseUser implements IOutBaseUserInfo {

  @Override
  public Map getBaseUserInfo() {
    Map map = new HashMap();
    map.put("userName", "afsfsf");
    return map;
  }
}
